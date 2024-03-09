package ec.com.characters.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import ec.com.characters.service.dto.dragonballz.ItemDto;
import ec.com.characters.service.dto.response.GaleryResponseDto;

@Mapper
public interface GaleryResponseMapper {

	GaleryResponseMapper INSTANCE = Mappers.getMapper(GaleryResponseMapper.class);

	GaleryResponseDto toGaleryResponseDto(ItemDto in);

}
