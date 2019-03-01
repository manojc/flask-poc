# import libraries
import numpy as np
import pandas as pd  # data processing, CSV file I/O (e.g. pd.read_csv)
from seaborn import color_palette
from sklearn.preprocessing import LabelEncoder
from sklearn.preprocessing import OneHotEncoder
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import classification_report, confusion_matrix

color = color_palette()

# read data
df = pd.read_csv("C:/Users/Localstars/Documents/new_df.csv")
del df['Unnamed: 0']

data = df['dealer_group']
values = np.array(data)

# integer encode
label_encoder = LabelEncoder()
dealer_encoded = label_encoder.fit_transform(values)
print(dealer_encoded)

# binary encode
onehot_encoder = OneHotEncoder(sparse=False)
dealer_encoded = dealer_encoded.reshape(len(dealer_encoded), 1)
onehot_encoded = onehot_encoder.fit_transform(dealer_encoded)
dfOneHot = pd.DataFrame(onehot_encoded, columns=[
                        "band" + str(int(i)) for i in range(onehot_encoded.shape[1])])
df1 = pd.concat([df, dfOneHot], axis=1)

# define target variable
X = df1.drop(['dealer_name', 'price_category', 'dealer_group', 'ID'], axis=1)
y = df1['price_category']

# manipulated budget
# ==================
# X = df1.drop(['dealer_name', 'budget','dealer_group','ID'], axis=1)
# y = df1['budget']

# split the data into training and testing

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.20)

# apply the classifer

classifier = DecisionTreeClassifier()
classifier.fit(X_train, y_train)

# predict
y_pred = classifier.predict(X_test)

# evaluate the results

print(confusion_matrix(y_test, y_pred))
print(classification_report(y_test, y_pred))

# merge the predicted result with the actual
df_new = pd.DataFrame(df, y_pred)
df_new_col = list(df_new.head(n=0))
