package spring_introduction.config_annotations_components_3.models;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat_3 extends Pet_3 {

    public Cat_3() {
    }

//    @Autowired
//    public Cat_3(@Value("${cat.name}") String name) { //внедрение значения аргумента через консруктор
//        super(name);
//    }

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
