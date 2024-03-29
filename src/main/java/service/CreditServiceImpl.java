package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import model.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import repository.CreditRepository;

@Service
@RequiredArgsConstructor
public class CreditServiceImpl implements  CreditService {
	
	@Autowired
    CreditRepository creditRepository;


	@Override
	public Mono<Credit> createCredit(Credit c) {
		return creditRepository.save(c);
	}

	@Override
	public Mono<Credit> findByCustomerId(String id) {
		return creditRepository.findById(id);
	}

	@Override
	public Flux<Credit> findAllCredit() {
		return creditRepository.findAll();
	}

	@Override
	public Mono<Credit> updateCredit(Credit c) {
		return creditRepository.save(c);
	}

	@Override
	public Mono<Void> deleteCredit(String id) {
		return creditRepository.deleteById(id);
	}

	@Override
	public Mono<String> message() {
		// TODO Auto-generated method stub
		return null;
	}

}
