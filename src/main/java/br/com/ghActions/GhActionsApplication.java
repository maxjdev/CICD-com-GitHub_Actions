package br.com.ghActions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GhActionsApplication {

	@GetMapping
	public String home() {
		System.out.println("""
				------------------
				HELLO WORLD !!!
				------------------
				""");
		return "<h1>Hello World!</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(GhActionsApplication.class, args);
	}
}
