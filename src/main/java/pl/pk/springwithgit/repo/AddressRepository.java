package pl.pk.springwithgit.repo;

import org.springframework.data.repository.CrudRepository;
import pl.pk.springwithgit.domain.Address;

import java.util.List;

public interface AddressRepository extends CrudRepository<Address, Long> {

    List<Address> findAllOrderByCity();
}
