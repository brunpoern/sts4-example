package brunpoern.sts4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Sts4ExampleApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Sts4ExampleApp2Application.class, args);
	}
}

@RestController
class App1RestController {
  @GetMapping("/app2/hi")
  String hi() {
	  return Greetings.getMessage();
  }
}