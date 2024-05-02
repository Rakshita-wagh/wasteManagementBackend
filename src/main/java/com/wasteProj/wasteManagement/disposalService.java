package com.wasteProj.wasteManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class disposalService {

    @Autowired
    private disposalRepo disposalRepository;

//    public List<userModel> getAllUsers() {
//        return userRepository.findAll();
//    }
@Transactional
    public void createUser(disposalModel user) {
    disposalRepository.save(user);
}
}