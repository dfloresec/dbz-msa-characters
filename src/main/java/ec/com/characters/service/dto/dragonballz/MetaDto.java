package ec.com.characters.service.dto.dragonballz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MetaDto {
	private int totalItems;
	private int itemCount;
	private int itemsPerPage;
	private int totalPages;
	private int currentPage;
}
