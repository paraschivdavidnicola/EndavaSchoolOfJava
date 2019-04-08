package Main;

import Config.ProjectConfig;
import Objects.Cat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext an = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Cat c = an.getBean(Cat.class);
            System.out.println(c.name);
        }

    }
}
