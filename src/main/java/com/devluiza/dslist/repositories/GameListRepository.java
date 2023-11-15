package com.devluiza.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devluiza.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
