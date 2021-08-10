package com.ac.software.prueba.car.center.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ac.software.prueba.car.center.model.MechanicalDto;
import com.ac.software.prueba.car.center.model.exceptions.CarCenterException;
import com.ac.software.prueba.car.center.services.CarCenterService;

@Controller
public class CarCenterController {
	
	@Autowired
	CarCenterService carCenterService;
	
	
	
	@GetMapping("/home")
	public String list(Model model) {
		return "home";
	}
	
	
	
	@PostMapping("/save")
	public String insertMechanical(MechanicalDto mechanicalDto, BindingResult result, RedirectAttributes attributes, Model model) {

		try {
			carCenterService.insertMechanical(mechanicalDto);
			attributes.addFlashAttribute("msg", "Registro Guardado");

			return "redirect:/home";
		} catch (CarCenterException e) {
			model.addAttribute("textoError", e.getMessage());
			return "error-page";
		}
	}
	
	
	@GetMapping("/list_available")
	public String listAvailable( Model model) {

		try {
			model.addAttribute("list", carCenterService.findAllMechanicalAvailable());
			return "list";
		} catch (CarCenterException e) {
			model.addAttribute("textoError", e.getMessage());
			return "error-page";
		}
	}
	
	

}
