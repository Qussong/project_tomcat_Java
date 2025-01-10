package org.example;

import org.apache.catalina.startup.Tomcat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class WebApplicationServer {

    private static final Logger log = LoggerFactory.getLogger(WebApplicationServer.class);

    public static void main(String[] args) throws Exception {
        String webappDirLocation = "webapps/";  // tomcat 의 root directory
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        // localhost:8080 접근시 아래 경로에 접근하도록 설정
        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        log.info("configured app dir: {}", new File(webappDirLocation).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();

    }
}
