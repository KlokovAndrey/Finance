package com.project.finance.controllers;

import com.project.finance.Entity.GetAnswer.Category;
import com.project.finance.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SummaryController {

    @Autowired
    EntryService entryService;

    @GetMapping("/sumAll")
    public double sumByLoginController(@RequestParam String login) {
        double sum;
        try {
            sum = entryService.sumAll(login);
        } catch (Exception ex){
            sum = 0;
        }
        return sum;
    }

@PostMapping("/sumOfCategory")
public double sumByLoginAndCategoryController(@RequestBody Category category) {
    double sum;
    try {
        sum = entryService.sumOfCategory(category.getLogin(), category.getCategory());
    } catch (Exception ex){
        sum = 0;
    }
    return sum;
}
}

