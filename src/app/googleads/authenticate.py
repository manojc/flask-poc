from os import getenv
from googleads import adwords, oauth2

ADWORDS_CLIENT = None


def main():

    global ADWORDS_CLIENT

    if ADWORDS_CLIENT is not None:
        return ADWORDS_CLIENT

    client_id = getenv("CLIENT_ID")
    client_secret = getenv("CLIENT_SECRET")
    refresh_token = getenv("REFRESH_TOKEN")
    developer_token = getenv("DEVELOPER_TOKEN")
    user_agent = getenv("USER_AGENT")
    client_customer_id = getenv("CLIENT_CUSTOMER_ID")
    oauth2_client = oauth2.GoogleRefreshTokenClient(
        client_id, client_secret, refresh_token)

    ADWORDS_CLIENT = adwords.AdWordsClient(
        developer_token, oauth2_client, user_agent,
        client_customer_id=client_customer_id)

    return ADWORDS_CLIENT


if __name__ == '__main__':
    main()
