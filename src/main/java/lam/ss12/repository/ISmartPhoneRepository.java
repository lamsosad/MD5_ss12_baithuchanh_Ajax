package lam.ss12.repository;

import lam.ss12.model.SmartPhone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartPhoneRepository extends CrudRepository<SmartPhone, Long> {
        Iterable<SmartPhone> findAllByProducerContaining(String producer);
}
