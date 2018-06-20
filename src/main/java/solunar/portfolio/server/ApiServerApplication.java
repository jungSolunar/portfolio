package solunar.portfolio.server;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties
@EnableEncryptableProperties
@ComponentScan
//@MapperScan("com.atto.server.mapper")
public class ApiServerApplication {

	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(ApiServerApplication.class.getName());
		SpringApplication.run(ApiServerApplication.class, args);
		log.info("Server Started");
	}
}

