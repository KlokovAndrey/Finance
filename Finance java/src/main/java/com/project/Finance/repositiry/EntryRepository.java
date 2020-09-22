package com.project.Finance.repositiry;

import com.project.Finance.Entity.Send.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EntryRepository extends JpaRepository<Entry, Integer> {
    List<Entry> findByCategory(String category);
}
