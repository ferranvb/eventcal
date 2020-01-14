package cat.emprul.eventcal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import cat.emprul.eventcal.view.BasicView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "cat.emprul" })
//@ImportResource({
//	"classpath:META-INF/persistence.xml"
//})
public class RootApplicationConfig {
	@Bean
	 public ViewResolver configureViewResolver() {
	     InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
	     viewResolve.setPrefix("/*");
	     viewResolve.setSuffix(".xhtml");

	     return viewResolve;
	 }
	
	
}
