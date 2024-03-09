package ec.com.characters.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ec.com.characters.service.dto.dragonballz.ItemDto;
import ec.com.characters.service.dto.response.GaleryResponseDto;
import ec.com.characters.service.mapper.GaleryResponseMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class CharacterCircuitBreakerService {

	private final DragonBallZService dragonBallZService;

	private final CharacterService characterService;

	public List<GaleryResponseDto> findAll() {
		try {
			List<ItemDto> listRest = dragonBallZService.findAll().getItems();

			List<GaleryResponseDto> lista2 = listRest.stream()
					.map(elemento -> GaleryResponseMapper.INSTANCE.toGaleryResponseDto(elemento))
					.collect(Collectors.toList());

			return lista2;
		} catch (Exception e) {
			log.error("Error en el api de Dragon Ball Z");
			return null;
		}
	}

}
