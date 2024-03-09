package ec.com.characters.repository;

import ec.com.characters.service.dto.dragonballz.RootDto;
import feign.RequestLine;

public interface DragonBallZClient {

	@RequestLine("GET /api/characters")
	public RootDto getCharacters();

}