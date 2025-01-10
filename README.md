# Embedded Tomcat 을 활용하여 Server 띄우기

[_Velog_tomcat-webserver_URL_](https://velog.io/@kih0976/Tomcat-Web-Server%EC%8B%A4%EC%8A%B5)

### 🔻환경

- OS : Windows 11
- Language : Java 17

    >openjdk version "17.0.13" 2024-10-15</br>OpenJDK Runtime Environment Temurin-17.0.13+11 (build 17.0.13+11)</br>OpenJDK 64-Bit Server VM Temurin-17.0.13+11 (build 17.0.13+11, mixed mode, sharing)<br>

- IDE : IntelliJ IDEA Ultimate 2024.3.1.1</br>
- Build Tool : Gradle
- Test Tool : JUnit 5
- Library : tomcat-embed-core, tomcat-jasper, servlet-api, jsp-api, jstl-api, logback-classic

### 🔻Tomcat Standard Directory Layout

[_Application Developer's Guide URL (ver 11.0.2)_](https://tomcat.apache.org/tomcat-11.0-doc/appdev/deployment.html)

<img src="/img/tomcat-standard-layout.png" width="">

이를 참고하여 프로젝트 폴더에 webapps 디렉터리를 추가하고 빌드 출력 경로를 변경해준다.

<img src="/img/webapps.png" width="">

<img src="/img/buildoutputpath.png" width="">

### 🔻결과

실행시 아래와 같이 정상적으로 Tomcat 서버가 실행됨을 출력 로그로 확인할 수 있다.

<img src="/img/tomcatresult.png" width="">
