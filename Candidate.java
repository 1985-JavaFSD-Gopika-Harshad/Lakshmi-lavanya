package com.revature.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "candidates")  // Specify the table name if needed
public class Candidate {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)  // Ensures name is not null
    private String name;

    @Column(nullable = false, unique = true)  // Ensures email is unique and not null
    private String email;

    @Column(nullable = false)  // Ensures address is not null
    private String address;

}
