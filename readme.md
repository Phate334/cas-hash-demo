# Apereo CAS Authenticate with Hashed Password

## Run

- Add `cas.example.org` to your hosts file:

```
> echo '127.0.0.1 cas.example.org' >> /etc/hosts
```

```
> docker-compose up -d
```

- Trying [CAS properties](https://apereo.github.io/cas/5.0.x/installation/Configuration-Properties.html#database-authentication)
  - CAS WAR file will repackage when container restart everytime, so you can just modify [bootstrap.properties](./cas/src/main/resources/bootstrap.properties) and restart it.

```
> docker-compose restart cas
```

## Login

- Default user account in [db](./db/init.sql).

- [https://cas.example.org:8443/cas/login](https://cas.example.org:8443/cas/login)

- [https://cas.example.org:8443/cas/logout](https://cas.example.org:8443/cas/logout)

## Create hashed password

- [try it](java-space\src\test\java\ShiroTest.java)

```java
DefaultHashService service = new DefaultHashService();
service.setHashAlgorithmName("SHA1");
service.setHashIterations(1);
HashRequest request = new HashRequest.Builder()
        .setSalt("edbe2384cf59c")
        .setSource("user2_password")
        .build();
String hashedPassword = service.computeHash(request).toHex();
```

## Reference

- [Apereo CAS Properties](https://apereo.github.io/cas/5.0.x/installation/Configuration-Properties.html)
- Github - [apereo/cas](https://github.com/apereo/cas)
- Docker Hub - [apereo/cas](https://hub.docker.com/r/apereo/cas/)
