package com.pafProject;



import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Service

public class supplyerService {
	@Autowired
	private supplyerRepository repo;
	
	public List<supplyer> listAll(){
		return repo.findAll();
		
		}
	
	//save 
	@Transactional(readOnly = false,isolation = Isolation.READ_COMMITTED)
	public supplyer save(supplyer product) {
		return repo.save(product);
	}
	public supplyer get(Long id) {
		return repo.findById(id).get();
	}
//	public void delete(Long id) {
	//	repo.deleteById(id);		
//	}
	
	
}

