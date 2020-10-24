package com.project.finance.service;

import com.project.finance.entity.send.Entry;
import com.project.finance.repositiry.EntryRepository;
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

    public List<Entry> findByLogin(String login){ return entryRepository.findByLogin(login); }

    public List<Entry> findByLoginAndCategory(String login, String category) {return entryRepository.findByLoginAndCategory(login, category);};

    public double sumAll(String login){return entryRepository.sumAll(login);}

    public double sumOfCategory(String login, String category){return entryRepository.sumOfCategory(login, category);}

    public void save(Entry book){
        entryRepository.save(book);
    }

    public void deleteById(int id){
        entryRepository.deleteById(id);
    }
}
