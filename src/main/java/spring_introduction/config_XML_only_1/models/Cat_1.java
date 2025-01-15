package spring_introduction.config_XML_only_1.models;

public class Cat_1 extends Pet_1{

    public Cat_1() {
    }

    public Cat_1(String name) {
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
