package com.lombardi.inheritance;

import com.lombardi.inheritance.beans.Boxer;
import com.lombardi.inheritance.beans.Wrestler;
import com.lombardi.inheritance.repositories.BoxerRepository;
import com.lombardi.inheritance.repositories.FighterRepository;
import com.lombardi.inheritance.repositories.WrestlerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FighterRepositoryTest {

    @Autowired
    WrestlerRepository wrestlerRepository;

    @Autowired
    BoxerRepository boxerRepository;

    @Autowired
    FighterRepository fighterRepository;

    @Test
    public void testRepositories() {

        // Using CRUD functionality (Create)
        // Create Wrestler objects and insert them into 'fighter' table
        wrestlerRepository.save(new Wrestler("Brock", "Lesnar", true));
        wrestlerRepository.save(new Wrestler("Daniel", "Cormier", false));
        wrestlerRepository.save(new Wrestler("Justin", "Gaethje", true));
        wrestlerRepository.save(new Wrestler("Khabib", "Nurmagomedov", true));
        wrestlerRepository.save(new Wrestler("Tito", "Ortiz", true));

        // Using CRUD functionality (Retrieve)
        // Retrieves all Wrestlers and prints them to console
        System.out.println("Retrieved Wrestlers contained in 'fighter' table:");
        wrestlerRepository.findAll().forEach(System.out::println);

        // Using CRUD functionality (Create)
        // Create Boxer objects and insert them into 'fighter' table
        boxerRepository.save(new Boxer("Floyd", "Mayweather", false));
        boxerRepository.save(new Boxer("Muhammad", "Ali", false));
        boxerRepository.save(new Boxer("Marvin", "Hagler", true));
        boxerRepository.save(new Boxer("Tiofomo", "Lopez", false));
        boxerRepository.save(new Boxer("Vasyl", "Lomachenko", false));
        boxerRepository.save(new Boxer("Terence", "Crawford", true));

        // Using CRUD functionality (Retrieve)
        // Retrieves all Boxers and prints them to console
        System.out.println("Retrieved Boxers contained in 'fighter' table:");
        boxerRepository.findAll().forEach(System.out::println);

        // Using CRUD functionality (Retrieve)
        // Retrieves a Wrestler by id
        Optional<Wrestler> tempWrestler = wrestlerRepository.findById((long)1);

        // Using CRUD functionality (Update)
        if (tempWrestler.isPresent()){
            tempWrestler.get().setFirstName("Jon");
            tempWrestler.get().setLastName("Jones");

            // Saves the updated Wrestler
            wrestlerRepository.save(tempWrestler.get());
        }

        // Using CRUD functionality (Retrieve)
        // Retrieves a Boxer by id
        Optional<Boxer> tempBoxer = boxerRepository.findById((long)6);

        // Using CRUD functionality (Update)
        if (tempBoxer.isPresent()){
            tempBoxer.get().setFirstName("Hitman");
            tempBoxer.get().setLastName("Hearns");

            // Saves the updated Boxer
            boxerRepository.save(tempBoxer.get());
        }

        // Using CRUD functionality (Delete)
        // Deletes a Wrestler by id
        wrestlerRepository.deleteById((long)2);

        // Using CRUD functionality (Delete)
        // Deletes a Boxer by id
        boxerRepository.deleteById((long)7);

        // Using CRUD functionality (Retrieve)
        // Retrieves all Fighters and prints them to console
        System.out.println("Retrieved Fighters contained in 'fighter' table:");
        fighterRepository.findAll().forEach(System.out::println);
    }
}
