package client;


import com.scalekit.ScalekitClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ClientConfig {
    @Value("${scalekit.client.id}")
    String clientId;
    @Value("${scalekit.client.secret}")
    String clientSecret;
    @Value("${scalekit.environment.url}")
    String environmentUrl;
    @Bean
    ScalekitClient scalekitClient() {
        return new ScalekitClient(environmentUrl, clientId, clientSecret);
    }

}
