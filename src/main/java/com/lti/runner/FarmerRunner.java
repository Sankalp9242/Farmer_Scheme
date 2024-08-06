package com.lti.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lti.entity.Address;
import com.lti.entity.Farmer;
import com.lti.repository.FarmerRepository;

@Component
public class FarmerRunner implements CommandLineRunner{

	@Autowired
	FarmerRepository dao;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(dao);
        Farmer farmer=new Farmer();
        farmer.setAadharNo(6373738393939393L);
        farmer.setBalance(10000);
        farmer.setContactNo("387373248");
        farmer.setEmail("Advait@gmail.com");
        farmer.setFarmerFirstName("Advait");
        farmer.setFarmerLastName("Koshti");
        farmer.setLandDetails("4 hector");
        farmer.setPassword("advait7272");
        
        
        //Address Setting
        
        Address addr = new Address();
        addr.setCity("Mumbai");
        addr.setFarmer(farmer);
        addr.setPincode("400037");
        addr.setState("Maharashtra");
        addr.setStreet("salt");
        
        
        int savedFarmer=dao.addOrUpdateFarmer(farmer);
        System.out.println(savedFarmer);
		
	}

	
	
}
