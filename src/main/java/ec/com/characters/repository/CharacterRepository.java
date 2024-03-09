package ec.com.characters.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.characters.domain.CharacterEntity;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterEntity, Integer> {

}
