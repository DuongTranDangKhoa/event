package com.example.event.DTO;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="Mid")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mid {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_menu")
    private Menu menu;

    @Column(name = "quantity")
    private int quantity;
}
