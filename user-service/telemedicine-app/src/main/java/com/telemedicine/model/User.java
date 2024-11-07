package com.telemedicine.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

//    @CollectionTable(name = "user_medical_history", joinColumns = @JoinColumn(name = "user_id"))
//    @Column(name = "medical_record")
//    private List<String> medicalHistory;
}
