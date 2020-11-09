package com.project.finance.repositiry;

import com.project.finance.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserData, Integer> {
    List<UserData> findAll();
    UserData findByLogin(String login);
    Boolean existsByLogin(String login);

    @Query("UPDATE userData SET email=?2, firstName=?3, lastName=?4 WHERE login=?1")
    void update(String login, String email, String firstName, String lastName);


}
