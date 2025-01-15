package spring_introduction.config_XML_and_annotations_2.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat_2 extends Pet_2 {

    public Cat_2() {
    }

    @Autowired
    public Cat_2(@Value("${cat.name}") String name) { //внедрение значения аргумента через консруктор
        super(name);
    }

    public void initMethod(){
        System.out.println("Cat_1 : initMethod");
    }

    public void destroyMethod(){
        System.out.println("Cat_1 : destroyMethod");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
