package com.example.event.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Card")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    @Id
    private int cardID;
    private double balance;
    private String username;
    private boolean status;
}
