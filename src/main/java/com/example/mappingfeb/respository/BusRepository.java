package com.example.mappingfeb.respository;

import com.example.mappingfeb.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}