package com.example.event;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "Account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    private String username;
    private String name;
    private String password;
    private Boolean status;
    private String role;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "Account_Shop",
            joinColumns = {
                    @JoinColumn(name = "username", referencedColumnName = "username",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "shopId", referencedColumnName = "shopID",
                            nullable = false, updatable = false)})
    private Set<Shop> shoplist;

    public Account(String username, String name, String password, Boolean status, String role) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.status = status;
        this.role = role;
    }
}
