package com.group.letscoding.domain.user;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private  String name;
    private String role;
    private LocalDateTime createDate;
    @Column(nullable = false)
    private String stack;

    @PrePersist
    public void createDate() {
        this.createDate = LocalDateTime.now();
    }
}
