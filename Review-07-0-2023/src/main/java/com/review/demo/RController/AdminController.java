package com.review.demo.RController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.review.demo.RModel.AdminModel;
import com.review.demo.RService.AdminService;

@RestController
public class AdminController 
{
	@Autowired
	AdminService aser;
	
	@PostMapping("/post")
	public AdminModel postDetails(@RequestBody AdminModel am)
	{
		return aser.saveData(am);
	}
	
	@GetMapping("/getall")
	public List<AdminModel> getAllDetails()
	{
		return aser.getAllData();
	}
	
	@GetMapping("/get/{id}")
	public Optional<AdminModel> getDetailsById(@PathVariable("id")int id,@RequestBody AdminModel am)
	{
		return aser.getDataById(id);
	}
	
	@PutMapping("/update/{id}")
	public AdminModel putDetails(@RequestBody AdminModel am)
	{
		return aser.updateData(am);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(int id)
	{
		aser.deleteData(id);
		return id+" was deleted successfully";
	}
}
