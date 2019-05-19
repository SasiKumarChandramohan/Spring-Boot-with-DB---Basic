package springBootLearningwithDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLearningwithDBApplication  {
	/*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootLearningwithDBApplication.class);
    }*/
	public static void main(String[] args) {
		
		String webPort = System.getenv("PORT");
		if (webPort == null || webPort.isEmpty()) {
			webPort = "8080";
		} 
		System.setProperty("server.port", webPort);
		
		SpringApplication.run(SpringBootLearningwithDBApplication.class, args);
	}
	/*@Bean
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf){  
	    return hemf.getSessionFactory();  
	}*/
	
	
	
	
}
