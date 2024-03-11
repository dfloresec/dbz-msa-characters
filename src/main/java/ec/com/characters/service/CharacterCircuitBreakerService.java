package ec.com.characters.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ec.com.characters.domain.CharacterEntity;
import ec.com.characters.service.dto.dragonballz.ItemDto;
import ec.com.characters.service.dto.response.DetailResponseDto;
import ec.com.characters.service.dto.response.GaleryResponseDto;
import ec.com.characters.service.mapper.DetailResponseMapper;
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
			List<ItemDto> listRest = dragonBallZService.findAll(true).getItems();
			log.info("Conexión al api de DragonBallZ exitosa.");
			return listRest.stream().map(elemento -> GaleryResponseMapper.INSTANCE.toGaleryResponseDto(elemento))
					.collect(Collectors.toList());
		} catch (Exception e) {
			log.error("Error con la conexión al api de DragonBallZ.", e);
			List<CharacterEntity> listBD = characterService.findAll();
			return listBD.stream().map(elemento -> GaleryResponseMapper.INSTANCE.toGaleryResponseDto(elemento))
					.collect(Collectors.toList());
		}
	}

	public DetailResponseDto findById(Integer id) {
		try {
			log.info("Conexión al api de DragonBallZ exitosa.");
			return DetailResponseMapper.INSTANCE.toDetailResponseDto(dragonBallZService.findOne(id));
		} catch (Exception e) {
			log.error("Error con la conexión al api de DragonBallZ.", e);
			return null;
		}
	}

}
