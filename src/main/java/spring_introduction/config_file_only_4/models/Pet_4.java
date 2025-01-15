package spring_introduction.config_file_only_4.models;

public abstract class Pet_4 {
private String name;

    public Pet_4() {
    }

    public Pet_4(String name) {
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
