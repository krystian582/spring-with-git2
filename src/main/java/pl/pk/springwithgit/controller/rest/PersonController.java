package pl.pk.springwithgit.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pk.springwithgit.domain.Person;

@RestController
public class PersonController {

    @GetMapping("/person")
    public Person me() {
        return new Person("Krystian", "K.");
    }
}
