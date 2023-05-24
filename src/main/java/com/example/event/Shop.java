package com.example.event;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Shop")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
    @Id
    private String shopID;
    private String area;
    private boolean status;
    private String description;
    @ManyToOne
    @JoinColumn(name = "eventID")
    private Event eventID;
    @ManyToMany(mappedBy = "shoplist", fetch = FetchType.LAZY)
    private Set<Account> accountList = new HashSet<>();

}
