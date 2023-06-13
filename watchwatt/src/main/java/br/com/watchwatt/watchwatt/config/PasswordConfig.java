package br.com.watchwatt.watchwatt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {
  @Bean
  public static PasswordEncoder getPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
