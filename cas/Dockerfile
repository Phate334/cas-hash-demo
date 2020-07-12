FROM apereo/cas:v5.0.4

COPY ./pom.xml /cas-overlay/pom.xml

RUN cd /etc/cas/ && \
    keytool -genkeypair -alias cas -keyalg RSA -keypass changeit \
    -storepass changeit -keystore ./thekeystore \
    -dname "CN=cas.example.org,OU=Example,OU=Org,C=AU" \
    -ext SAN="dns:example.org,dns:localhost,ip:127.0.0.1"

WORKDIR /cas-overlay