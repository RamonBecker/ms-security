package com.eazybytes.springsecurity.infraestructure.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static com.eazybytes.springsecurity.infraestructure.commom.AccountUrlCommom.ACCOUNT_URL;
import static com.eazybytes.springsecurity.infraestructure.commom.CardUrlCommom.CARD_URL;
import static com.eazybytes.springsecurity.infraestructure.commom.ContactUrlCommom.CONTACT_URL;
import static com.eazybytes.springsecurity.infraestructure.commom.UserDetailTransactionUrlCommom.TRASACTION_USER_DETAILS_URL;
import static com.eazybytes.springsecurity.infraestructure.commom.LoanUserUrlCommom.LOAN_USER_URL;
import static com.eazybytes.springsecurity.infraestructure.rest.api.notice.commom.NoticeUrlCommom.NOTICE_URL;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {


    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());


        http.authorizeHttpRequests((requests) -> requests
                .requestMatchers(ACCOUNT_URL, TRASACTION_USER_DETAILS_URL, LOAN_USER_URL, CARD_URL).authenticated()
                .requestMatchers(NOTICE_URL, CONTACT_URL, "/error").permitAll());

//        http.formLogin(AbstractHttpConfigurer::disable);
//        http.httpBasic(AbstractHttpConfigurer::disable);

        http.formLogin(withDefaults());
        http.httpBasic(withDefaults());

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {

        var user = User.withUsername("user").password("{noop}12345").authorities("read").build();
        var admin = User.withUsername("admin").password("{noop}12345").authorities("admin").build();

        return new InMemoryUserDetailsManager(user, admin);
    }

}
