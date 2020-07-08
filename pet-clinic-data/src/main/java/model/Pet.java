package model;

import java.util.Date;

import lombok.Data;

@Data
public class Pet extends BaseEntity{
	private PetType petType;
	private Owner owner;
	private Date birthDate;

}
