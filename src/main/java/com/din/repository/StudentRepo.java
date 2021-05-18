package com.din.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.din.model.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student, Integer>{

	Student findByName(String string);

	Student findByCell(String cell);

	Student findByNameAndCell(String string, String cell);

}
