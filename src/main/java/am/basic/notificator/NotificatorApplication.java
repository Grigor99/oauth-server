package am.basic.notificator;

import am.basic.notificator.auth.util.Md5Encoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;


@SpringBootApplication
public class NotificatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificatorApplication.class, args);
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new Md5Encoder();
    }


    @Bean
    public TokenStore tokenStore(DataSource dataSource){
        return new JdbcTokenStore(dataSource);
    }
}
