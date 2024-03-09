package ec.com.characters.service.dto.dragonballz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {
	private Integer id;
	private String name;
	private String ki;
	private String maxKi;
	private String race;
	private String gender;
	private String description;
	private String image;
	private String affiliation;
	private Object deletedAt;
}
