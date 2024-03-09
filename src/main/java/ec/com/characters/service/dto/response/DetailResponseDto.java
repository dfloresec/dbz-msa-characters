package ec.com.characters.service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailResponseDto {

	private String race;

	private String originPlanet;
	
	private String maxKi;
	
	private String description;
	
	private String affiliation;

}
