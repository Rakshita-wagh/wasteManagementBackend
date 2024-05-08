package com.wasteProj.wasteManagement;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface signupRepo extends MongoRepository<signupModel, String> {
    signupModel findByname(String name);

}
