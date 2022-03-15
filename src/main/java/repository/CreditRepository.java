package repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import model.Credit;

public interface CreditRepository extends ReactiveMongoRepository<Credit, String> {

}
