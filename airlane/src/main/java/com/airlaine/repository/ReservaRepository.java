package com.airlaine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlaine.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}
