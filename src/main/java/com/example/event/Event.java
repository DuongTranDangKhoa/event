package com.example.event;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "Event")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    @Id
    private int eventID;
    private String eventName;

    private String eventContent;
    private String img;
    private LocalDate beginDate;
    private LocalDate endDate;
    private String area;
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "username")
    private Account username;

    // Constructors, getters, and setters (omitted for brevity)
}
