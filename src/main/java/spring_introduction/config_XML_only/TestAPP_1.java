package spring_introduction.config_XML_only;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.config_XML_only.models_1.Person_1;

public class TestAPP_1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextXMLOnly.xml");

        Person_1 person = context.getBean("myPerson", Person_1.class);
        person.callMyPet();

        context.close();
    }
}
