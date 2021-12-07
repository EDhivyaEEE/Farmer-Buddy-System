package net.javaguides.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.onlineshopping.model.Farmer;


public interface FarmerRepository extends JpaRepository<Farmer, Long> {

}
