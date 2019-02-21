from googleads import adwords, oauth2

# OAuth2 credential information. In a real application, you'd probably be
# pulling these values from a credential storage.
CLIENT_ID = '187908472532-4cjp0rfl32916i1vbjv7c8culteniipt.apps.googleusercontent.com'
CLIENT_SECRET = 'AR_DNTd8ylG5XzTKKiEcxRDY'
REFRESH_TOKEN = '1/hyZTbS4LlcFKoWQ_XvAe8Ps9K4nNQ7I7lQYLlfMvxmk'

# AdWords API information.
DEVELOPER_TOKEN = 'womxUeF2tS3RJ0-ckxNmTw'
USER_AGENT = 'INSERT_USER_AGENT_HERE'
CLIENT_CUSTOMER_ID = '410-224-8876'


def main():
    client_id = CLIENT_ID
    client_secret = CLIENT_SECRET
    refresh_token = REFRESH_TOKEN
    developer_token = DEVELOPER_TOKEN
    user_agent = USER_AGENT
    client_customer_id = CLIENT_CUSTOMER_ID
    oauth2_client = oauth2.GoogleRefreshTokenClient(
        client_id, client_secret, refresh_token)

    adwords_client = adwords.AdWordsClient(
        developer_token, oauth2_client, user_agent,
        client_customer_id=client_customer_id)

    return adwords_client


if __name__ == '__main__':
    main()
