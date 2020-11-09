package com.project.finance.service;

import com.project.finance.entity.UserData;
import com.project.finance.repositiry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void save(UserData user){userRepository.save(user);}
    public void delete(UserData user){userRepository.delete(user);}
    public void update(UserData user){userRepository.update(user.getLogin(), user.getEmail(), user.getFirstName(), user.getLastName());}
    public boolean checkUser(UserData user){
        if(userRepository.existsByLogin(user.getLogin())){
            UserData existUser = userRepository.findByLogin(user.getLogin());
            if(!user.equals(existUser)) update(user);
            return true;
        }
        else{
            save(user);
            return false;
        }
    }
    public List<UserData> findAll(){ return userRepository.findAll();}
    public UserData findByLogin(String login){ return userRepository.findByLogin(login);}
    public boolean existsByLogin(String login){return userRepository.existsByLogin(login);}
}
