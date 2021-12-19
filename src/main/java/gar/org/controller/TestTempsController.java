package gar.org.controller;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gar.org.entites.Gare;

@RestController
@RequestMapping("/setrag")
@CrossOrigin(origins = "*")
public class TestTempsController {
	
	@GetMapping("/temps")
	public  Long AjouterGare() {
		
		LocalDateTime localDateTime1 = LocalDateTime.of(2021, 3, 13, 0, 30, 45);
		LocalDateTime localDateTime2 = LocalDateTime.of(2021, 5, 17, 13, 30, 45);

		Duration duration = Duration.between(localDateTime1, localDateTime2);
		System.out.println("duration: " + duration); // PT61H (61 Hours)

		long days = ChronoUnit.DAYS.between(localDateTime1, localDateTime2);
		
		
		return days;
	}

}
