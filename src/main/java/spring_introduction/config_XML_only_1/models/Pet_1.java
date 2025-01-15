package spring_introduction.config_XML_only_1.models;

public abstract class Pet_1 {
private String name;

    public Pet_1() {
    }

    public Pet_1(String name) {
        this.name = name;
    }

    public abstract void say();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
