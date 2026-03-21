package br.com.erudio;

import java.util.ArrayList;
import java.util.List;
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
    // Novo método para retornar uma lista de pessoas
    public List<Person> findAll() {
        logger.info("Finding all people!");
        List<Person> persons = new ArrayList<>();

        // Loop para criar 8 pessoas mockadas
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    // Método auxiliar (Encapsulamento) para não repetir código
    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name " + i);
        person.setLastName("Last name " + i);
        person.setAddress("Some address in Brazil " + i);
        person.setGender("Male");
        return person;
    }

}
