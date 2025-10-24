package org.example.lab07_20222297.repository;

import org.example.lab07_20222297.entity.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrabajadorRepository extends JpaRepository<Trabajador, Integer> {
}
