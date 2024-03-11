package ec.com.characters.service.dto.dragonballz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailOriginPlanetDto{
    private Integer id;
    private String name;
    private boolean isDestroyed;
    private String description;
    private String image;
    private Object deletedAt;
}
