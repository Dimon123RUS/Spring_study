package spring_introduction.config_XML_and_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.config_XML_and_annotations.models_2.Person_2;

public class TestAPP2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContextXMLAndJavaCode.xml");

        Person_2 person = context.getBean("personBean", Person_2.class);
        person.callMyPet();

        context.close();
    }
}
