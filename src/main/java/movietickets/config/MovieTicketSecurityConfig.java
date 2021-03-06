package movietickets.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by jmtapang on 9/28/17.
 */
@Configuration
public class MovieTicketSecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    private UserDetailsService userDetailsService;


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .formLogin()
                .loginPage("/login")
                .usernameParameter("username").passwordParameter("password")
                .permitAll()  // Unrestricted access to the login page
                .and()
                .exceptionHandling()
                .accessDeniedPage("/denied")
                .and()

                .authorizeRequests()
                //.antMatchers("/movie/*").hasRole("USER")
                .antMatchers("/movie/*").hasAnyRole("USER","ADMIN")
                .antMatchers("/movie/**/").hasRole("ADMIN")
                .and()
                .logout()
                .permitAll()
                .logoutSuccessUrl("/");

    }

/*     @Override
     protected void configure(HttpSecurity http) throws Exception {
           http.authorizeRequests()
          .antMatchers("/hello").access("hasRole('ROLE_ADMIN')")
          .anyRequest().permitAll()
          .and()
            .formLogin().loginPage("/login")
            .usernameParameter("username").passwordParameter("password")
          .and()
            .logout().logoutSuccessUrl("/login?logout")
           .and()
           .exceptionHandling().accessDeniedPage("/403")
          .and()
            .csrf();
         }*/

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordencoder());
       /* auth.inMemoryAuthentication().withUser("user").password("user1").roles("USER")
                .and()
                .withUser("admin").password("admin1").roles("ADMIN");*/
    }

    @Bean(name="passwordEncoder")
    public PasswordEncoder passwordencoder(){
        return new BCryptPasswordEncoder();
    }

}
