package com.example.event;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "Menu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    @Id
    private int MenuID;
    private String productName;
    private double price;
    private String img;
    private String content;
    @ManyToOne
    @JoinColumn(name = "shopID")
    private Shop shopId;
    private String catagories;
}
