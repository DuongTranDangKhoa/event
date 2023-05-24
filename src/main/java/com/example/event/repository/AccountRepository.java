package com.example.event.repository;

import com.example.event.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, String>{
    public List<Account> findByName(String name);
    public Account findByUsernameAndPassword(String username, String password);
    @Query(value = "select * from account where username = ?1", nativeQuery = true)
    public List<Account> getAllAcount(String u);

}
