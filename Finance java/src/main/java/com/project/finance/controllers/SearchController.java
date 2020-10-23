package com.project.finance.controllers;

import com.project.finance.Entity.GetAnswer.Category;
import com.project.finance.Entity.Send.Entry;
import com.project.finance.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SearchController {

    @Autowired
    EntryService entryService;

    @GetMapping("/search")
    public List<Entry> mainController(@RequestParam String login) {
        return entryService.findByLogin(login);
    }

    @GetMapping("/findByCategory")
    public List<Entry> findByLoginAndCategoryController(@RequestBody Category category) {
        return entryService.findByLoginAndCategory(category.getLogin(),category.getCategory());
    }


    @PostMapping("/add")
    public void addController(@RequestBody Entry entry){
        entry.setDate(new Date());
        entryService.save(entry);
    }
}
