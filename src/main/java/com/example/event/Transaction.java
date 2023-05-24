package com.example.event;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="Transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(nullable = false)
    private int transactionId;
    @ManyToOne
    @MapsId
    @JoinColumn (name ="cardID")
    private Card cardID;
    private String action;
    private String payment;
    @OneToOne
    @MapsId
    @JoinColumn (name = "orderId")
    private Order orderId;
}
