package spring_introduction.config_annotations_components_3.models;

public abstract class Pet_3 {
private String name;

    {
        name = "pet";
    }

    public Pet_3() {
    }

    public Pet_3(String name) {
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
