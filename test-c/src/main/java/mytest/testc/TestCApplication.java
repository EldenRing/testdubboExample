package mytest.testc;

import com.biz.service.HkService;

import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
public class TestCApplication {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Reference(version = "1.0", url = "dubbo://127.0.0.1:30002")
    private HkService hkService;


    public static void main(String[] args) {
        SpringApplication.run(TestCApplication.class, args);
    }
    @Bean
    public ApplicationRunner runner() {
        return args -> {
            logger.info(hkService.sayHello());
        };
    }

}
