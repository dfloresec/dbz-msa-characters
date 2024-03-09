package ec.com.characters.service.dto.dragonballz;

import lombok.Data;

@Data
public class ItemDto {
	public int id;
    public String name;
    public String ki;
    public String maxKi;
    public String race;
    public String gender;
    public String description;
    public String image;
    public String affiliation;
    public Object deletedAt;
}
