package com.example.event.controller;

import com.example.event.DTO.Account;
import com.example.event.repository.AccountRepository;
import com.example.event.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/")
    public String getFirstStar(){
        return "Get Star successfully";

    }
    @PostMapping("/insert")//sdfsfda
    public void AddNewAccount(){
        for(int i = 0;i < 10; i++){
            Account acc = new Account("user" + i, "user" + i, "12345", true, "USER");
            accountService.addNewAccount(acc);
        }
    }
}
