package spring_introduction.config_annotations_components_3.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person_3 {
    private String name;
    private int age;
    private Pet_3 pet;

    public Person_3() {
    }

    @Autowired //внедрение зависимости Pet с уточнением кого именно потому что сомпонентов типа Prt >1
    public Person_3(@Qualifier("dogBean") Pet_3 pet) {
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

    public Pet_3 getPet() {
        return pet;
    }

    public void setPet(Pet_3 pet) {
        this.pet = pet;
    }
}
