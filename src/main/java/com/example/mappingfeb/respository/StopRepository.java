package com.example.mappingfeb.respository;

import com.example.mappingfeb.entity.Stop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StopRepository extends JpaRepository<Stop, Long> {
}