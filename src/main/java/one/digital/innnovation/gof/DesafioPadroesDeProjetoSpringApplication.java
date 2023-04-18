package one.digital.innnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioPadroesDeProjetoSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(DesafioPadroesDeProjetoSpringApplication.class, args);
	}
}
