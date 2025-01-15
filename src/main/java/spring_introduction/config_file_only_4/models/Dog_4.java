package spring_introduction.config_file_only_4.models;

public class Dog_4 extends Pet_4 {

    public Dog_4() {
    }

    public Dog_4(String name) {
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
