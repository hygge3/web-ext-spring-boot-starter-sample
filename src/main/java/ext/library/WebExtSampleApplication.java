package ext.library;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("ext.library.mapper")
public class WebExtSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebExtSampleApplication.class, args);
    }

}