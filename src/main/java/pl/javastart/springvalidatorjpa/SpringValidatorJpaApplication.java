package pl.javastart.springvalidatorjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import pl.javastart.springvalidatorjpa.model.Person;
import pl.javastart.springvalidatorjpa.repository.PersonRepository;

@SpringBootApplication
public class SpringValidatorJpaApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(SpringValidatorJpaApplication.class, args);
        Person person = new Person("Jan", null, "złyMail", 0);
        PersonRepository personRepository = ctx.getBean(PersonRepository.class);
        personRepository.add(person);

        ctx.close();
    }


}
