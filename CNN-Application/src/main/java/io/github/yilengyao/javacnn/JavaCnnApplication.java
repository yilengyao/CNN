package io.github.yilengyao.javacnn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
  scanBasePackages = {
    "io.github.yilengyao.javacnn.configuration.ApplicationSpecificSpringComponentScanMarkerApplicationSpecificSpringComponentScanMarker.class"
  }
)
public class JavaCnnApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCnnApplication.class, args);
	}

}
