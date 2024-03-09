package ec.com.characters.repository;

import ec.com.characters.service.dto.dragonballz.DetailItemDto;
import feign.Param;
import feign.RequestLine;

public interface DragonBallZDetailClient {

	@RequestLine("GET /api/characters/{id}")
	public DetailItemDto getCharacter(@Param("id") String id);

}