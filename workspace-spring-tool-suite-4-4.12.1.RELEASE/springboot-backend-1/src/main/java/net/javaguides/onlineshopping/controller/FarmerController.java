package net.javaguides.onlineshopping.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.onlineshopping.model.Farmer;
import net.javaguides.onlineshopping.service.FarmerService;

@RestController
@RequestMapping("/api/farmer")

public class FarmerController {
	
	private FarmerService farmerService;

	public FarmerController(FarmerService farmerService) {
		super();
		this.farmerService = farmerService;
	}
	
	//build create farmer REST API
	@PostMapping()
	public ResponseEntity<Farmer> saveFarmer(@RequestBody Farmer farmer){
		return new ResponseEntity<Farmer>(farmerService.saveFarmer(farmer),HttpStatus.CREATED);
		
	}
	
	

}
