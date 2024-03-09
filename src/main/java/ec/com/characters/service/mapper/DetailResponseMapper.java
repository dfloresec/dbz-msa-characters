package ec.com.characters.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import ec.com.characters.service.dto.dragonballz.DetailItemDto;
import ec.com.characters.service.dto.response.DetailResponseDto;

@Mapper
public interface DetailResponseMapper {

	DetailResponseMapper INSTANCE = Mappers.getMapper(DetailResponseMapper.class);

	@Mapping(target = "originPlanet", source = "originPlanet.name")
	DetailResponseDto toDetailResponseDto(DetailItemDto in);

}
