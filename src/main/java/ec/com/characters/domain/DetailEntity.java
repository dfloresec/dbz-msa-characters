package ec.com.characters.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Embeddable
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetailEntity {

	String race;

	String originPlanet;
	
	String maxKi;
	
	@Column(length = 1000)
	String description;
	
	String affiliation;

}
