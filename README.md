# License Authenticator

## 개요

라이선스키의 유효성을 검사하고자 하는 애플리케이션입니다. 요청으로 보낸 라이선스키에 대한 유효성을 체크하는 방식입니다.
Mac Address 관련 인증이 필요하기 때문에, 컨테이너화를 하지 않았습니다.
해당 기본 포트번호는 8000입니다.(변경 가능)

## 순서

1. `license-authenticator`를 클론한다.
2. `라이선스 키 발급 시스템`에서 발급한 `secret.txt` 를 resources 폴더에 넣는다.

## Clone

Cloning the `license-authenticator`


## application.yml 작성

```yaml
server:
  port: 8000
spring:
  application:
    name: license-authenticator
springdoc:
  api-docs:
    path: /api-docs
  swagger-ui:
    path: /swagger-ui.html
secret:
  solutionId: [ 솔루션 번호 ]
  algorithm: AES
  key-file-path: secretkey.txt
  mode: AES/ECB/PKCS5Padding
```

## Build & Run

Build

```shell
$ ./gradlew bootJar
```

Run

```shell
$ java build/libs/license-authenticator-0.0.1-SNAPSHOT.jar
```

## Test

```yaml
curl -X POST http://[hosturl]/api/license/auth \
-H "Content-Type: application/json" \
  -d '{
"licenseKey": "[라이선스 키]"
}'
```
