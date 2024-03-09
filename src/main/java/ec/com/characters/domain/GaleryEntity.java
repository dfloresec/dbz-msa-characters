package ec.com.characters.domain;

import jakarta.persistence.Embeddable;
import lombok.ToString;

@Embeddable
@ToString
public class GaleryEntity {
	
	String name;

	String gender;

	String ki;
	
	String image;

}
