#!/bin/bash

sed \
-e "s/\${ENV}/$ENV/" \
-e "s/\${GOOGLE_LOGIN}/$GOOGLE_LOGIN/" \
-e "s/\${GOOGLE_PASSWORD}/$GOOGLE_PASSWORD/" \
-e "s/\${GOOGLE_CLIENT_ID}/$GOOGLE_CLIENT_ID/" \
-e "s/\${GOOGLE_CLIENT_SECRET}/$GOOGLE_CLIENT_SECRET/" \
-e "s/\${GITHUB_CLIENT_ID}/$GITHUB_CLIENT_ID/" \
-e "s/\${GITHUB_CLIENT_SECRET}/$GITHUB_CLIENT_SECRET/" \
-e "s/\${EMAIL_USERNAME}/$EMAIL_USERNAME/" \
-e "s/\${EMAIL_PASSWORD}/$EMAIL_PASSWORD/" \
-e "s/\${AUTH_SECRET_TOKEN}/$AUTH_SECRET_TOKEN/" \
-e "s/\${AUTH_CAPTCHA_PUBLIC}/$AUTH_CAPTCHA_PUBLIC/" \
-e "s/\${AUTH_CAPTCHA_SECRET}/$AUTH_CAPTCHA_SECRET/" \
$1 > $2
