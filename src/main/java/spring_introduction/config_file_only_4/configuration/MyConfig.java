package spring_introduction.config_file_only_4.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_introduction.config_file_only_4.models.Cat_4;
import spring_introduction.config_file_only_4.models.Person_4;
import spring_introduction.config_file_only_4.models.Pet_4;

@Configuration
public class MyConfig {

    @Bean
    public Pet_4 cat(){
        return new Cat_4();
    }

    @Bean
    public Person_4 personBean(){
        return new Person_4(cat());
    }
}
