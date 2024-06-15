package org.monkey.monkeyclientsdk;

import lombok.Data;
import org.monkey.monkeyclientsdk.client.MonkeyApiClient;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("monkey.client")
@Data
@ComponentScan
public class MonkeyApiClientConfig {
    private String accessKey;
    private String secretKey;

    @Bean
    public MonkeyApiClient MonkeyClientConfig(){
        return new MonkeyApiClient(accessKey, secretKey);
    }


}
