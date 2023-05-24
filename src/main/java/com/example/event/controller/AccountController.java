package com.example.event.controller;

import com.example.event.Account;
import com.example.event.repository.AccountRepository;
import com.example.event.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @Autowired
    AccountRepository accountRepository;

    // GET, POST, DELETE, PUT ....
    // GET lấy dữ liệu từ DB lên Frontend
    // POST nhập dữ liệ xuống DB
    // DELETE xóa
    // PUT update
    @GetMapping("/select")
    public List<Account> getAccount(){
        return accountRepository.findAll();
    }
    @PostMapping("/insert")
    public void AddNewAccount(){
        for(int i = 0;i < 10; i++){
            Account acc = new Account("user" + i, "user" + i, "12345", true, "USER");
            accountService.addNewAccount(acc);
        }
    }
}
