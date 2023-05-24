package com.example.event;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Entity
@Table(name = "Order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(nullable = false)
    private int orderId;
    @Column(name = "date")
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private Date date;
    private double total;
    @ManyToOne
    @JoinColumn(name = "shopID")
    private Shop shopId;
    @ManyToOne
    @JoinColumn(name = "cardID")
    private Card cardID;
}
