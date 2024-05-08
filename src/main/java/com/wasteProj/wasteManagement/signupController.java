package com.wasteProj.wasteManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/signup")
public class signupController {

    @Autowired
    private signupRepo signupRepository;

    @PostMapping
    public signupModel addUser(@RequestBody signupModel users)
    {
        return signupRepository.save(users);
    }
}
