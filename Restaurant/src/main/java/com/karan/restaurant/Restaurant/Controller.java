package com.karan.restaurant.Restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
	
	
	@Autowired
	Repository  repo;
	
	// get all restaurant 
	
	@GetMapping("restaurant")
	public List<Restaurant> getRest()
	{
		return (List<Restaurant>)repo.findAll();
	}

	// save (insert / update)
	
	@PostMapping("restaurant")
	public Restaurant SaveRest( @RequestBody Restaurant rest)
	{
	     return  repo.save(rest);
	    
	}
	
	// delete 
	
	@DeleteMapping("restaurant/{id}")
	public String deleteRest(@PathVariable Integer id)
	{
		repo.deleteById(id);
		return "Deleted";
				
	}
	

}
