package brunpoern.sts4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Sts4ExampleApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sts4ExampleApp1Application.class, args);
	}
}

@ConditionalOnClass(name = "java.lang.String")
@RestController
class App1RestController {
	@GetMapping("/app1/hi")
	String hi() {
		return Greetings.getMessage();
	}
}
