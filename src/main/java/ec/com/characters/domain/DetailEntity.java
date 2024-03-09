package ec.com.characters.domain;

import jakarta.persistence.Embeddable;
import lombok.ToString;

@Embeddable
@ToString
public class DetailEntity {

	String race;

	String originPlanet;
	
	String maxKi;
	
	String description;
	
	String affiliation;

}
