package ec.com.characters.service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailResponseDto {

	private Integer id;

	private String name;

	private String gender;

	private String race;

	private String originPlanet;

	private String ki;
	
	private String maxKi;

	private String description;

	private String image;

	private String affiliation;
}
