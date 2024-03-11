package ec.com.characters.component;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ec.com.characters.service.CharacterService;
import ec.com.characters.service.DragonBallZService;
import ec.com.characters.service.dto.dragonballz.ItemDto;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InicializationComponent implements InitializingBean {

	@Autowired
	private DragonBallZService dragonBallZService;

	@Autowired
	private CharacterService characterService;

	@Override
	public void afterPropertiesSet() {
		log.info("Inicia carga");
		List<ItemDto> list = dragonBallZService.findAll(false).getItems();
		characterService.saveAll(list);
		log.info("Fin carga" + list.size());
	}

}
