package com.github.hoodcat;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.provider.endpoint.CheckTokenEndpoint;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//@EnableOAuth2Sso
@SpringBootApplication
public class MyOAuth2TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyOAuth2TestApplication.class, args);
    }

    @RequestMapping(value = "/oauth/check_token")
    @ResponseBody
    public Map<String, ?> checkToken(@RequestParam(value = "token") String value) {
        CheckTokenEndpoint check = new CheckTokenEndpoint(new DefaultTokenServices());
        
        return check.checkToken(value);
    }
}
