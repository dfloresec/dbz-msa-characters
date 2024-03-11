package ec.com.characters.domain;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Embeddable
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GaleryEntity {
	
	String name;

	String gender;

	String ki;
	
	String image;

}
