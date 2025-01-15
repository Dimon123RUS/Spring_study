package spring_introduction.config_file_only_4.models;

public class Cat_4 extends Pet_4 {

    public Cat_4() {
    }

    public Cat_4(String name) {
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
