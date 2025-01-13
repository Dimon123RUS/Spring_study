package spring_introduction.config_XML_only.models_1;

public class Person_1 {
    private String name;
    private int age;
    private Pet_1 pet;

    public Person_1() {
    }

    public Person_1(Pet_1 pet) {
        this.pet = pet;
    }

    public void callMyPet(){
        System.out.println("Hello, my lovely pet.");
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

    public Pet_1 getPet() {
        return pet;
    }

    public void setPet(Pet_1 pet) {
        this.pet = pet;
    }
}
