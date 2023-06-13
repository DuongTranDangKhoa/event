package com.example.event.DTO;

import com.example.event.DTO.Account;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EventImg")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventImg {
    @Id
    @ManyToOne
    @JoinColumn(name = "Event")
    private Account username;
    private String img;
}
