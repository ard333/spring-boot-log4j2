package id.web.ard.springbootlog4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLog4j2Application implements ApplicationRunner {
	
	private static final Logger logger = LogManager.getLogger(SpringBootLog4j2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLog4j2Application.class, args);
	}

	//example log message using ApplicationRunner
	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		logger.debug("Debugging log");
		logger.info("Info log");
		logger.warn("Hey, This is a warning!");
		logger.error("Hey, We have an Error here.");
		logger.fatal("WTF! Fatal error.");
	}
}
