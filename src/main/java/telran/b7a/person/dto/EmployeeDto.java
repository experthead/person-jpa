package telran.b7a.person.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class EmployeeDto extends PersonDto {
	
	public EmployeeDto(Integer id, String name, LocalDate birthDate, AddressDto address, String company,
			Integer salary) {
		super(id, name, birthDate, address);
		this.company = company;
		this.salary = salary;
	}
	String company;
	Integer salary;
}
