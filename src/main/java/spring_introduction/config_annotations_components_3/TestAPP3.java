package spring_introduction.config_annotations_components_3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introduction.config_annotations_components_3.configuration.MyConfig;
import spring_introduction.config_annotations_components_3.models.Person_3;

public class TestAPP3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person_3 person = context.getBean("personBean", Person_3.class);
        person.callMyPet();

        context.close();
    }
}
