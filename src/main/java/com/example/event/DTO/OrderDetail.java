package com.example.event.DTO;
import com.example.event.DTO.Menu;
import com.example.event.DTO.Order;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(nullable = false)
    private int No;
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order orderID;
    @ManyToOne
    @JoinColumn(name ="MenuID")
    private Menu MenuID;
    private int quantity;
    private double price;
    private double total;

}
