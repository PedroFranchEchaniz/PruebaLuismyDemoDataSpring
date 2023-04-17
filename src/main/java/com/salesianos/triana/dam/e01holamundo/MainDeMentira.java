package com.salesianos.triana.dam.e01holamundo;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainDeMentira {
	
	@Autowired
	private TaskRepositorio taskrepositorio;
	
	@PostConstruct
	public void ejecutar() {
		Task t1 = Task.builder()
				.title("Esto")
				.done(true)
				.limisDate(LocalDate.of(2023, 4, 16))
				.build();
		Task t2 = Task.builder()
				.title("Esto2")
				.done(false)
				.limisDate(LocalDate.of(2023, 4, 17))
				.build();
		taskrepositorio.save(t1);
		taskrepositorio.save(t2);
		
		List<Task> resultados = taskrepositorio.findAll();
		
		resultados.forEach(System.out::println);
	}
	
}
