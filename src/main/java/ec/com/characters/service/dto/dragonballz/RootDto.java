package ec.com.characters.service.dto.dragonballz;

import java.util.ArrayList;

import lombok.Data;

@Data
public class RootDto {
	private ArrayList<ItemDto> items;
	private MetaDto meta;
	private LinksDto links;
}
