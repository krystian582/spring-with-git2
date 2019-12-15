package pl.pk.springwithgit.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@Entity
public class Address {
    private String city;
    private String street;
    private int flatNumber;
}
