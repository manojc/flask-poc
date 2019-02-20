# -*- coding: utf-8 -*-
"""
Created on Wed Feb 20 13:35:29 2019

@author: Ambreen Khurram
"""
#import libraries
import numpy as np # linear algebra
import pandas as pd # data processing, CSV file I/O (e.g. pd.read_csv)


#load the file
df = pd.read_csv("C:/Users/Localstars/Documents/listings.csv")


#DATA EXPLORATION
#===================
#check headings
#df.head()

#check for duplicates
#for column in df:
#   print(df.duplicated(column).sum())

#check count
#df.count()

#get total null values
#df.isnull().sum().sum()

#Get stats
#df.describe().T

#DATA CLEANING
#=============

#Since there is a space in col names we need to remove it
df.rename(columns={'owner Title': 'owner_Title','owner Id':'owner_Id' ,'sale Price': 'price','msrp Price': 'msrp_price', 'primary Price': 'primary_Price'}, inplace=True)

#if price is equla to zero set price equal to msrp else leave it as it is.
df['avg_price'] = np.where(df['price']==0, df['msrp_price'], df['price'])

#if price is equla to zero set price equal to primary price else leave it as it is.
df['avg_price'] = np.where(df['price']==0, df['primary_Price'], df['price'])

#get mean values for car's based on make and model
df3 = pd.DataFrame(df.groupby(['make','model'])['primary_Price'].mean())

#replace the missing values with mean prices of cars
df4 = pd.merge(df, df3,  how='left', left_on=['make','model'], right_on = ['make','model'])
df4.loc[df4['avg_price'].isnull(),'avg_price']=df4['primary_Price_y']
df4 = df4[['id','owner_Id','owner_Title','make','model','year','vin','priority','style','avg_price']]
df4 = df4.sort_values('avg_price', ascending=[False]) 
df4["avg_price"].fillna(0, inplace = True) 

#Groupby owner title and get min,max and total stock prices
df5 = df4.groupby('owner_Title', as_index=False).agg({"avg_price": [min,max,sum]})

#find total number of cars
df5a = pd.DataFrame(df4.groupby('owner_Title', as_index=False).size())
df5a.rename(columns={'index': 'owner_Title',0 :'Total_cars'}, inplace=True)
df5a = df5a.sort_values('Total_cars',ascending=False)
df5a.reset_index(level=0, inplace=False)
df5a.index.names = ['owner_Title']

#merge two datafrmes to get vales for total no. of cars, min, macx, total
df5b = pd.merge(df5, df5a,  how='left', left_on=['owner_Title'], right_on = ['owner_Title'])
df5b = df5b.rename(columns = {('owner_Title', '') : 'owner_title1',('avg_price', 'min'):'min', ('avg_price', 'max'):'max',('avg_price', 'sum'):'sum'})
df5b = pd.DataFrame(df5b[['owner_Title','min','max','sum','Total_cars']])
df5b.rename(columns={'owner_Title': 'owner_Title','min':'Avg_price_min','max':'Avg_price_max','sum':'Avg_price_sum','number_of_cora':'number_of_cars'}, inplace=True)

#find mean stock prices for dealers
df6 = pd.DataFrame(df4.groupby(['owner_Title'])['avg_price'].mean())

#merge the two dataframes togather
big_df = pd.merge(df5b, df6,  how='left', left_on=['owner_Title'], right_on = ['owner_Title'])
big_df = big_df.sort_values('Avg_price_sum',ascending=False)
big_df = big_df.reset_index(drop=True)

#Create Bands
total_row_count=len(big_df)
row_207 = int(total_row_count * 200/1935)
row_407 = int(total_row_count * 400/1935)
row_607=int(total_row_count* 600/1935)
row_807 = int(total_row_count * 800/1935)
row_1007 = int(total_row_count * 1000/1935)
row_1207 = int(total_row_count * 1200/1935)
row_1407 = int(total_row_count * 1400/1935)
row_1607=int(total_row_count* 1600/1935)
row_1807=int(total_row_count* 1800/1935)

# Set up conditions:
conds = [(big_df.index >= 0) & (big_df.index <= row_207),
         (big_df.index > row_207) & (big_df.index<=row_407),
         (big_df.index > row_407) & (big_df.index<=row_607),
         (big_df.index > row_607) & (big_df.index<=row_807),
         (big_df.index > row_807) & (big_df.index<=row_1007),
         (big_df.index > row_1007) & (big_df.index<=row_1207),
         (big_df.index > row_1207) & (big_df.index<=row_1407),
         (big_df.index > row_1407) & (big_df.index<=row_1607),
         (big_df.index > row_1607) & (big_df.index<=row_1807),
         (big_df.index > row_1807)]

# Set up target values (in the same order as your conditions)
choices = ['Band-1', 'Band-2', 'Band-3', 'Band-4','Band-5','Band-6','Band-7','Band-8','Band-9','Band-10']
tarrif = [999, 899, 799, 699,599,499,399,299,199,99]

# Assign df['ticker']
big_df['ticker'] = np.select(conds, choices)
big_df['tarrif'] = np.select(conds, tarrif)

#get the budget
df7 = big_df.groupby(['ticker','tarrif'],as_index=False).agg({"Avg_price_sum": sum, "Avg_price_min": sum, "Avg_price_max":sum,"Total_cars":sum})
df7 = pd.DataFrame(df7.sort_values('Avg_price_sum',ascending=False))
df7 = df7.groupby('ticker').sum().eval('mean_stock_price= Avg_price_sum / Total_cars')
df7 = pd.DataFrame(df7.sort_values('Avg_price_sum',ascending =False))


#Divide the max,min,sum with 1000 to reduce the units
df7['Avg_price_sum'] = df7['Avg_price_sum'].div(1000)
df7['Avg_price_min'] = df7['Avg_price_min'].div(1000)
df7['Avg_price_max'] = df7['Avg_price_max'].div(1000)
df7['mean_stock_price'] = df7['mean_stock_price'].div(1000)
df7['mean_stock_price'] = round(df7['mean_stock_price'],4)
df7 = df7.reset_index(level=0, inplace=False)


#change the data type to integer
df7['Avg_price_sum'] = df7['Avg_price_sum'].astype('int') 
df7['Avg_price_min'] = df7['Avg_price_min'].astype('int') 
df7['Avg_price_max'] = df7['Avg_price_max'].astype('int') 
df7['mean_stock_price'] = df7['mean_stock_price'].astype('int') 



#define a function to return values for query
#===========================================

def cars( var1,var2 ):
    if (var1 >= 5872200 and var2 >= 135219):
        print("Band-0")
    elif (var1 > 3278076 and var1 <= 5872200 and var2 > 92111 and var2 <= 135219):
        print("Band-1")
    elif (var1 > 2287621 and var1 <= 328076 and var2 > 68015 and var2 <= 92111):
        print("Band-2")
    elif (var1 > 1552400 and var1 <= 2287621 and var2 > 50139 and var2 <= 68015):
        print("Band-3")
    elif (var1 > 907690 and var1 <= 1552400 and var2 > 32067 and var2 <= 50139):
        print("Band-4")
    elif (var1 > 350017 and var1 <= 907690 and var2 > 16517 and var2 <= 32067):
        print("Band-5")
    elif (var1 > 150294 and var1 <= 350017 and var2 > 8931 and var2 <= 16517):
        print("Band-6")
    elif (var1 > 69676 and var1 <=  150294 and var2 > 4586 and var2 <= 8931):
        print("Band-7")
    elif (var1 > 28108 and var1 <= 69676 and var2 > 2224 and var2 <= 4586):
        print("Band-8")
    elif (var1 > 4651 and var1 <=  28108 and var2 > 322 and var2 <= 2224):
        print("Band-9")
    elif (var1 > 0 and var1 <=  4651 and var2 > 0 and var2 <= 322):
        print("Band-10")
    else:
        print("none of the above")

#call the function
#================-
cars(12000,1000)