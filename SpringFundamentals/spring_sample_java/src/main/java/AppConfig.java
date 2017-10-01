import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.pluralsight.repository.CustomerRepo;
import com.pluralsight.repository.HibernateCustomerRepoImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.pluralsight"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static  PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
/*	@Bean(name="customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl impl = new CustomerServiceImpl();
//		impl.setCustomerRepo(getCustomerRepository());
		return impl;
	}
*/	
//	@Bean(name="customerRepository")
//	public CustomerRepo getCustomerRepository() {
//		return new  HibernateCustomerRepoImpl ();
//	}

}
