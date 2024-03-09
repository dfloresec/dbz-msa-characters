package ec.com.characters.service.dto.dragonballz;

import java.util.ArrayList;

import lombok.Data;

@Data
public class RootDto {
	public ArrayList<ItemDto> items;
	public MetaDto meta;
	public LinksDto links;
}
