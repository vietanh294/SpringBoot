package Activity31.VietAnh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class VietAnhApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(VietAnhApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8082"));
		app.run(args);
	}

}
