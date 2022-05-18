package com.example.infosystem.model;

import javax.persistence.*;

@Entity
@Table(name = "lexical")
public class FileLexicographical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "words")
    private String words;
}
