package spring_introduction.config_XML_and_annotations_2.models;

public abstract class Pet_2 {
private String name;

    {
        name = "pet";
    }

    public Pet_2() {
    }

    public Pet_2(String name) {
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
