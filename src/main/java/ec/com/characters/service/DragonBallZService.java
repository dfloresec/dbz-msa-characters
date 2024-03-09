package ec.com.characters.service;

import org.springframework.stereotype.Service;

import ec.com.characters.repository.DragonBallZRepository;
import ec.com.characters.service.dto.dragonballz.RootDto;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DragonBallZService {

	private final DragonBallZRepository dragonBallZRepository;

	public RootDto findAll(boolean online) {
		if (online) {
			return dragonBallZRepository.getCharactersOnline();
		}
		return dragonBallZRepository.getCharactersDB();

	}

}
