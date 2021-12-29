package telran.b7a.person.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ChildDto extends PersonDto {
	
	
	
	public ChildDto(Integer id, String name, LocalDate birthDate, AddressDto address, String kindergarten) {
		super(id, name, birthDate, address);
		this.kindergarten = kindergarten;
	}

	String kindergarten;
}
