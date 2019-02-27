from numpy import nan, array as numpy_array
from pandas import read_csv, merge, DataFrame

bands_df = read_csv("./bands.csv")
df = read_csv("./slider.csv")


def add_band_id(x):
    band_df = bands_df.apply(lambda y: (y[6], y[7]) if
                             (x["price"] >= y["start_price"] and x["price"] <= y["End_price"]
                              and x["Total_cars"] == y['Total_cars'])
                             else None, axis=1)
    band_df = band_df.dropna(axis=0, how='all')
    if band_df.empty:
        band_df = nan
    else:
        band_df = band_df.to_string(index=False)
    return band_df


def get_bands(df):
    df['ticker'] = df.apply(add_band_id, axis=1)
    df['new'] = df.ticker.str.replace("[({':)]", "")
    gh = df['new'].str.split(',', expand=True)
    gh = gh.rename({0: 'band', 1: 'budget'}, axis='columns')
    df = df.drop(['ticker', 'new'], axis=1)
    merged = merge(DataFrame(gh), DataFrame(df),
                   left_index=True, right_index=True)
    merged = numpy_array(merged)
    print(merged)
    return merged


# call the function
# ================-
if __name__ == '__main__':
    print(df)
    get_bands(df)
