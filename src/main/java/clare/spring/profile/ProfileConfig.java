package clare.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 2个bean标签返回同类，靠profile区分
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("develop")
    public ProfileBean devDemoBean() {
        return new ProfileBean("develop");
    }

    @Bean
    @Profile("product")
    public ProfileBean prodDemoBean() {
        return new ProfileBean("product");
    }
}