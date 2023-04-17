package com.salesianos.triana.dam.e01holamundo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Task {

	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private boolean done;
	private LocalDate limisDate;
}
