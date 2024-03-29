package com.sbenturkia.dataprocessing.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sbenturkia.dataprocessing.model.Users;
import com.sbenturkia.dataprocessing.repository.UsersRepository;


@Component
public class Writer implements ItemWriter<Users>{
	
	@Autowired
	private UsersRepository repo;

	@Override
	@Transactional
	public void write(List<? extends Users> users) throws Exception {
		repo.saveAll(users);
	}
}
