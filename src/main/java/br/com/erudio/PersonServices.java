package br.com.erudio;

import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    // OOP: O método precisa receber um 'id' para saber QUEM buscar
    public Person findById(String id) {
        logger.info("Finding one person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Josival");
        person.setLastName("Alves");
        person.setAddress("Campina Grande - Paraíba");
        person.setGender("Male");

        return person;
    }
}
