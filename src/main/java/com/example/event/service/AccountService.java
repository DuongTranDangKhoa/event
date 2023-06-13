package com.example.event.service;

import com.example.event.DTO.Account;
import com.example.event.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accRepo;
    public void addNewAccount(Account acc){
        accRepo.save(acc);  // => string sql = ..... prepare statement = con.pre.... resusl....
    }

    public List<Account> findAccount(String userName){
        return accRepo.findByName(userName);
    }

    public Account checkLogin(String username, String password){
        return accRepo.findByUsernameAndPassword(username, password);
    }
    // C => save
    // R => find
    // U => save
    // D => delete
}
