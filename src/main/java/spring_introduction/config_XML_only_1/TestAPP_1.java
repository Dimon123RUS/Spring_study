package spring_introduction.config_XML_only_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.config_XML_only_1.models.Person_1;

public class TestAPP_1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextXMLOnly.xml");

        Person_1 person = context.getBean("myPerson", Person_1.class);
        person.callMyPet();

        context.close();
    }
}
