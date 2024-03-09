package ec.com.characters.repository;

import org.springframework.stereotype.Repository;

import ec.com.characters.service.dto.dragonballz.RootDto;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

@Repository
public class DragonBallZRepository {
	
	public RootDto getCharactersOnline() {
		DragonBallZClient client = Feign.builder()
				.encoder(new JacksonEncoder())
				.decoder(new JacksonDecoder())
				.target(DragonBallZClient.class, "https://dragonball-api.com");
		RootDto root = client.getCharacters();
		return root;
	}

	public RootDto getCharactersDB() {
		DragonBallZClient client = Feign.builder()
				.encoder(new JacksonEncoder())
				.decoder(new JacksonDecoder())
				.target(DragonBallZClient.class, "https://dragonball-api.com");
		RootDto root = client.getCharacters();
		return root;
	}
	
}
