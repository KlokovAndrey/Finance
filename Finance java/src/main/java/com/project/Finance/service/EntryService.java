package com.project.Finance.service;

import com.project.Finance.Entity.Send.Entry;
import com.project.Finance.repositiry.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryService {
    @Autowired
    private EntryRepository entryRepository;

    public List<Entry> findAll(){
        return entryRepository.findAll();
    }

    public List<Entry> findByCategory(String category){ return entryRepository.findByCategory(category); }

    public void save(Entry book){
        entryRepository.save(book);
    }

    public void deleteById(int id){
        entryRepository.deleteById(id);
    }
}
