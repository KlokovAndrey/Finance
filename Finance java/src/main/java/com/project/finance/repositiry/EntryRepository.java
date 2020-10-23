package com.project.finance.repositiry;

import com.project.finance.Entity.Send.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EntryRepository extends JpaRepository<Entry, Integer> {
    List<Entry> findByCategory(String category);
    List<Entry> findByLogin(String login);
    List<Entry> findByLoginAndCategory(String login, String category);
    @Query("SELECT SUM(e.sum) FROM Entry as e WHERE login = ?1")
    double sumAll(String login);
   @Query("SELECT SUM(e.sum) FROM Entry as e WHERE login=?1 AND category=?2")
    double sumOfCategory(String login, String category);
}
