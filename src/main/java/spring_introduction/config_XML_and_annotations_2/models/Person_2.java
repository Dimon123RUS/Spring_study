package spring_introduction.config_XML_and_annotations_2.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person_2 {
    private String name;
    private int age;
    private Pet_2 pet;

    public Person_2() {
    }

    @Autowired //внедрение зависимости Pet с уточнением кого именно потому что сомпонентов типа Prt >1
    public Person_2(@Qualifier("dogBean") Pet_2 pet) {
        this.pet = pet;
    }

    public void callMyPet(){
        System.out.println("Hello, my " + pet.getName());
        pet.say();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet_2 getPet() {
        return pet;
    }

    public void setPet(Pet_2 pet) {
        this.pet = pet;
    }
}
