package ec.com.characters.service.dto.dragonballz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailTransformationDto {

	private Integer id;
	private String name;
	private String image;
	private String ki;
	private Object deletedAt;

}
