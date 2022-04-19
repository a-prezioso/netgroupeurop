package com.example.gestionearea.repository;

import com.example.gestionearea.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepo extends JpaRepository<Area, Integer> {
}
