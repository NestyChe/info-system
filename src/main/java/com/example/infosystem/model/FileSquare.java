package com.example.infosystem.model;

import com.example.infosystem.repository.SquareRepository;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;

@Entity
@Table(name = "square")
public class FileSquare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "numbers")
    private String numbers;
}
