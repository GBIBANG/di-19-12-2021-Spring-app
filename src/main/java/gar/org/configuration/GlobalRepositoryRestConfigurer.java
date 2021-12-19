package gar.org.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import gar.org.entites.Client;
import gar.org.entites.Codebar;
import gar.org.entites.Colis;
import gar.org.entites.Gare;
import gar.org.entites.Ticket;
import gar.org.entites.Utilisateur;

@Configuration
public class GlobalRepositoryRestConfigurer {
	
	
	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurer() {
		
		return new RepositoryRestConfigurer() {
			
			@Override
			public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
				
				config.exposeIdsFor(Client.class, Colis.class, Codebar.class, Gare.class, Ticket.class, Utilisateur.class);
				config.setReturnBodyOnCreate(true);
				config.setReturnBodyOnUpdate(true);
				config.getCorsRegistry()
				.addMapping("/**")
				.allowedOrigins("*")
				.allowedMethods("HEAD","OPTIONS","GET", "POST", "PUT", "DELETE", "PATCH");
			}
		};
	}

}
