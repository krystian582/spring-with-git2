package pl.pk.springwithgit.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pk.springwithgit.domain.Address;

@RestController
@RequestMapping("/address")
public class AddressRestController {


    @GetMapping("/my")
    public Address getMyAddress() {
        return new Address("warsaw", "unknown", 40);
    }
}
