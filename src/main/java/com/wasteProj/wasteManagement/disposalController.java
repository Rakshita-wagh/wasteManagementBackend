package com.wasteProj.wasteManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/waste")
public class disposalController {

    @Autowired
    private disposalRepo wasteDataRepository;

    @PostMapping
    public disposalModel addWasteData(@RequestBody disposalModel wasteData) {
        return wasteDataRepository.save(wasteData);
    }
}
