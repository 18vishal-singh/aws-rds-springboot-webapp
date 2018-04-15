package paper.dao;

import org.springframework.data.repository.CrudRepository;
import paper.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
