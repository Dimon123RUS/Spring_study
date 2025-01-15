package spring_introduction.config_XML_only_1.models;

public class Dog_1 extends Pet_1 {

    public Dog_1() {
    }

    public Dog_1(String name) {
        super(name);
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
        System.out.println("Bow-wow");
    }

}
