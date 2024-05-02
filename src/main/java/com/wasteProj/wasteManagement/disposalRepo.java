package com.wasteProj.wasteManagement;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface disposalRepo extends MongoRepository<disposalModel,String> {
}
