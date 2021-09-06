package cm.deepdream.academia.security;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableCaching
@EnableBinding(Source.class)
@EntityScan({"cm.deepdream.academia.programmation.data", "cm.deepdream.academia.security.data",
	"cm.deepdream.academia.souscription.data"}) 
@EnableJpaRepositories(basePackages = "cm.deepdream.academia.security.repository")
@EnableEurekaClient
@SpringBootApplication
public class AcademiaSecurityApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(AcademiaSecurityApplication.class, args);
	}
	
	
}
