package tech.nanobyter.coronavirustracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author {nanobyter}
 * 			www.nanobyter.tech
 * 
 *         created: 2022-07-11
 */


@SpringBootApplication
@EnableScheduling
public class CoronaVirusTrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaVirusTrackApplication.class, args);
	}
}
