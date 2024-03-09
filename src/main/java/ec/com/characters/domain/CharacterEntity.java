package ec.com.characters.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "CHARACTER")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class CharacterEntity {

	@Id
	Integer id;

	@Embedded
	private GaleryEntity galery;

	@Embedded
	private DetailEntity detail;

}
