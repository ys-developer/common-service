package com.sgyj.commonservice.config;

import com.sgyj.commonservice.properties.JwtProperties;
import com.sgyj.commonservice.security.Jwt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class ServiceConfigure {

    @Bean
    public Jwt jwt(JwtProperties jwtProperties) {
        log.error("jwt properties.issuer :: {}", jwtProperties.getIssuer());
        return new Jwt(jwtProperties.getIssuer(), jwtProperties.getClientSecret());
    }

}
