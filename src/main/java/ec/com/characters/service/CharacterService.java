package ec.com.characters.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.com.characters.domain.CharacterEntity;
import ec.com.characters.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CharacterService {

	private final CharacterRepository characterRepository;

	public List<CharacterEntity> findAll() {
		return characterRepository.findAll();
	}

}
