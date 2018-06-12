package com.funkyganesha.autowiring.configurations;

import com.funkyganesha.autowiring.services.EnglishGreetingService;
import com.funkyganesha.autowiring.services.FrenchGreetingService;
import com.funkyganesha.autowiring.services.GreetingService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    @ConditionalOnProperty(name = "language.name", havingValue = "english", matchIfMissing = true)
    public GreetingService englishGreetingService() {
        return new EnglishGreetingService();
    }

    @Bean
    @ConditionalOnProperty(name = "language.name", havingValue = "french")
    public GreetingService frenchGreetingService() {
        return new FrenchGreetingService();
    }


}
