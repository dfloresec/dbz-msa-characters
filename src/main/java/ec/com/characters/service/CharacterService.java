package ec.com.characters.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.com.characters.domain.CharacterEntity;
import ec.com.characters.repository.CharacterRepository;
import ec.com.characters.service.dto.dragonballz.ItemDto;
import ec.com.characters.service.mapper.CharacterEntityMapperImpl;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CharacterService {

	private final CharacterRepository characterRepository;

	public List<CharacterEntity> findAll() {
		return characterRepository.findAll();
	}

	public void saveAll(List<ItemDto> list) {
		for (ItemDto itemDto : list) {
			CharacterEntity entity = CharacterEntityMapperImpl.toCharacterEntity(itemDto);
			characterRepository.save(entity);
		}
	}

}
