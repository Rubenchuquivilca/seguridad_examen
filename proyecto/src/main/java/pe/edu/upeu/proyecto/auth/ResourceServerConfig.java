package pe.edu.upeu.proyecto.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/categorias").permitAll()
		.antMatchers(HttpMethod.GET, "/api/categoriass/{id}").hasAnyRole("USER", "ADMIN")
		.antMatchers(HttpMethod.POST, "/api/categoria").hasAnyRole("USER", "ADMIN")
		.antMatchers(HttpMethod.POST, "/api/categoria").hasRole("ADMIN")
		.antMatchers("/api/clientes/**").hasRole("ADMIN")
		.anyRequest().authenticated();
	}

	
}
