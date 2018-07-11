package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rk0000 on 7/4/18.
 */
@RestController
@EnableAutoConfiguration
public class SpringBoot {
    @RequestMapping("/")
    String print() {
        return "HELLO SPRING BOOT ---> ";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBoot.class, args);
    }

}
