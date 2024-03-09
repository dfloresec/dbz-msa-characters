package ec.com.characters.service.mapper;

import ec.com.characters.domain.CharacterEntity;
import ec.com.characters.domain.DetailEntity;
import ec.com.characters.domain.GaleryEntity;
import ec.com.characters.service.dto.dragonballz.ItemDto;

public class CharacterEntityMapperImpl {

	static public CharacterEntity toCharacterEntity(ItemDto in) {
		return CharacterEntity.builder()
				.id(in.getId())
				.galery(GaleryEntity.builder().name(in.getName()).gender(in.getGender()).ki(in.getKi()).image(in.getImage()).build())
				.detail(DetailEntity.builder().race(in.getRace()).originPlanet("").maxKi(in.getMaxKi()).description(in.getDescription()).affiliation(in.getAffiliation()) .build())
		.build();
	}

	
	

}
