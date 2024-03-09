package ec.com.characters.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ec.com.characters.service.CharacterCircuitBreakerService;
import ec.com.characters.service.dto.response.GaleryResponseDto;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CharactersController {

	private final CharacterCircuitBreakerService characterCircuitBreakerService;

	@GetMapping(value = "/galery")
	@ResponseStatus(HttpStatus.OK)
	private List<GaleryResponseDto> getGalery() {
		return characterCircuitBreakerService.findAll();
	}

}
