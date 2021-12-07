package net.javaguides.onlineshopping.service.impl;

import org.springframework.stereotype.Service;

import net.javaguides.onlineshopping.model.Farmer;
import net.javaguides.onlineshopping.repository.FarmerRepository;
import net.javaguides.onlineshopping.service.FarmerService;

@Service
public class FarmerServiceImpl implements FarmerService {
	
    private FarmerRepository farmerRepository;
    
    
	public FarmerServiceImpl(FarmerRepository farmerRepository) {
		super();
		this.farmerRepository = farmerRepository;
	}


	@Override
	public Farmer saveFarmer(Farmer farmer) {
		return farmerRepository.save(farmer);
	}

}
