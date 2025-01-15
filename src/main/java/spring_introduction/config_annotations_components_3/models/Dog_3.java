package spring_introduction.config_annotations_components_3.models;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
public class Dog_3 extends Pet_3 {

    public Dog_3() {
    }


    public Dog_3(String name) {
        super(name);
    }


    @Override
    public String getName() {
        return super.getName();
    }


    @Override
//    @Value("${dog.name}")
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

    @PostConstruct //библиотеки нужно скачать вручную, набей в гугле "javax annotation api 1.3 2 jar"
    private void init() {
        System.out.println(this.getClass().getSimpleName() + " Class: init method_");
    }

    @PreDestroy
    private void destroy() {
        System.out.println(this.getClass().getSimpleName() + " Class: destroy method");
    }

}
