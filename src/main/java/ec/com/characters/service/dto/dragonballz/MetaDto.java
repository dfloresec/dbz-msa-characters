package ec.com.characters.service.dto.dragonballz;

import lombok.Data;

@Data
public class MetaDto {
	private int totalItems;
	private int itemCount;
	private int itemsPerPage;
	private int totalPages;
	private int currentPage;
}
