package com.devluiza.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devluiza.dslist.dto.GameListDTO;
import com.devluiza.dslist.entities.GameList;
import com.devluiza.dslist.repositories.GameListRepository;


@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
	
}
