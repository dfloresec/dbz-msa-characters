package ec.com.characters.service.dto.dragonballz;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RootDto {
	private ArrayList<ItemDto> items;
	private MetaDto meta;
	private LinksDto links;
}
