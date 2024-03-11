package ec.com.characters.service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GaleryResponseDto {

	private Integer id;

	private String name;

	private String gender;

	private String ki;

	private String image;

}
