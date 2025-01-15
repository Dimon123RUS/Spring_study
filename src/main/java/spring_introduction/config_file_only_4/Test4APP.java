package spring_introduction.config_file_only_4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introduction.config_file_only_4.configuration.MyConfig;
import spring_introduction.config_file_only_4.models.Person_4;

public class Test4APP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person_4 person = context.getBean("personBean", Person_4.class);
        person.callMyPet();

        context.close();
    }
}
