package com.projectpedro.gamelistbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectpedro.gamelistbackend.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
