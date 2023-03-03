package fr.solutec.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PatchDto {
	
	String op;
	
	String key;
	
	String value;

}
