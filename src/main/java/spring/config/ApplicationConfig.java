package spring.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import spring.entity.Address;

@Configuration
@ComponentScan(basePackages="spring")
public class ApplicationConfig {
	@Bean(initMethod="turnOn", destroyMethod="turnOff")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Address getAddress() {
		return new Address();
	}
}
