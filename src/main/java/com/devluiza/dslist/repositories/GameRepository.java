package com.devluiza.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devluiza.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
