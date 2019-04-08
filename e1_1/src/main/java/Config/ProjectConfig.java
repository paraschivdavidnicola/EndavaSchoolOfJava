package Config;


import Objects.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Cat cat() {
        Cat tom = new Cat();
        tom.name="Tom";
        return tom;
    }
}
