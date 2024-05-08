//package com.wasteProj.wasteManagement;
//
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private loginController loginController;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/api/products").authenticated() // Require authentication for product-related endpoints
//                .anyRequest().permitAll() // Allow access to other endpoints without authentication
//                .and()
//                .formLogin() // Enable form-based login
//                .loginProcessingUrl("/api/login") // Set the login endpoint
//                .successHandler((request, response, authentication) -> {
//                    // Authentication success handler
//                    response.setStatus(HttpServletResponse.SC_OK);
//                    response.getWriter().println("Login successful!");
//                })
//                .failureHandler((request, response, exception) -> {
//                    // Authentication failure handler
//                    response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//                    response.getWriter().println("Invalid username or password");
//                })
//                .permitAll(); // Allow access to the login endpoint without authentication
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        // Configure authentication manager to use the login controller for authentication
//        auth.authenticationProvider(new LoginAuthenticationProvider(loginController));
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
