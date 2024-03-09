package ec.com.characters.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import ec.com.characters.domain.CharacterEntity;
import ec.com.characters.service.dto.dragonballz.ItemDto;
import ec.com.characters.service.dto.response.GaleryResponseDto;

@Mapper
public interface GaleryResponseMapper {

	GaleryResponseMapper INSTANCE = Mappers.getMapper(GaleryResponseMapper.class);

	GaleryResponseDto toGaleryResponseDto(ItemDto in);

	@Mapping(target = "name", source = "galery.name")
	@Mapping(target = "gender", source = "galery.gender")
	@Mapping(target = "ki", source = "galery.ki")
	@Mapping(target = "image", source = "galery.image")
	GaleryResponseDto toGaleryResponseDto(CharacterEntity in);

}
