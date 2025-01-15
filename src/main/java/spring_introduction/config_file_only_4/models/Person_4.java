package spring_introduction.config_file_only_4.models;

public class Person_4 {
    private String name;
    private int age;
    private Pet_4 pet;

    public Person_4() {
    }

    public Person_4(Pet_4 pet) {
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

    public Pet_4 getPet() {
        return pet;
    }

    public void setPet(Pet_4 pet) {
        this.pet = pet;
    }
}
