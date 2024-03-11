package ec.com.characters.service.dto.dragonballz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinksDto {
	private String first;
	private String previous;
	private String next;
	private String last;
}
