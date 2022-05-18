package com.example.infosystem.repository;

import com.example.infosystem.model.FileSquare;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SquareRepository extends JpaRepository<FileSquare, Object> {
}
