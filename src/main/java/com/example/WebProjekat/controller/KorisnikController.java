package com.example.WebProjekat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.WebProjekat.entity.*;
import com.example.WebProjekat.entity.Korisnik;
import com.example.WebProjekat.service.KorisnikService;

@Controller
public class KorisnikController {
	
	@Autowired
	private KorisnikService korisnikService;
	
	public static Korisnik novi=new Korisnik();
	
	@GetMapping("/")
	public String welcome() {
		return "Homepage.html";
	}
	
	@GetMapping("/registration")
	public String registration(Model model) {
		return "registration.html";
	}
	
	@GetMapping("/Login")
	public String Login(Model model) {
		model.addAttribute("korisnik", new Korisnik());
		return "Login.html";
	}
	
	@GetMapping("/profile")
	public String profile(Model model) {
		model.addAttribute("korisnik", new Korisnik());
		return "profile.html";
	}
	
	@GetMapping("/AddCinema")
	public String AddCinema(Model model) {
		model.addAttribute("korisnik", new Korisnik());
		return "AddCinema.html";
	}
	
	@GetMapping("/information")
	public String information() {
		return "information.html";
	}
	
	@GetMapping("/RegistrationInformation")
	public String RegistrationInformation() {
		return "RegistrationInformation.html";
	}

	@GetMapping("/CinemaDone")
		public String CinemaDone() {
			return "CinemaDone.html";
		}

		

}
	
	
	

	

