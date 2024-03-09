package ec.com.characters.component;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ec.com.characters.service.DragonBallZService;
import ec.com.characters.service.dto.dragonballz.RootDto;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InicializationComponent implements InitializingBean {

	@Autowired
	private DragonBallZService dragonBallZService;

	@Override
	public void afterPropertiesSet() {
		log.info("Inicia carga");
		RootDto root = dragonBallZService.findAll();
		log.info("Fin carga" + root.items.size());
	}

}
