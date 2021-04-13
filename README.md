# demo-cas-client
基于springboot的cas客户端示例

#### 1.新建springboot项目并引入依赖
    <dependency>
      <groupId>org.jasig.cas.client</groupId>
      <artifactId>cas-client-support-springboot</artifactId>
      <version>3.6.2</version>
    </dependency>
#### 2.配置@EnableCasClient注解
    package com.codetiler.demo;
    import org.jasig.cas.client.boot.configuration.EnableCasClient;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    @SpringBootApplication
    @EnableCasClient
    public class Application {
        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }
    }
#### 3.配置application.properties文件
    server.port=8081
    #cas服务端配置
    cas.server-url-prefix=http://cas.codetiler.org:8443/cas
    cas.server-login-url=http://cas.codetiler.org:8443/cas/login
    #cas客户端配置
    cas.client-host-url=http://demo.codetiler.org:8081
    cas.validation-type=CAS3
#### 4.在浏览器中输入认证服务端的地址http://cas.codetiler.org:8443/cas 并登录，再次在浏览器中输入应用的地址http://demo.codetiler.org:8081 浏览器直接请求到，不需要再次登录。
