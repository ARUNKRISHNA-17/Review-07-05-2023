package com.review.demo.RService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review.demo.RModel.AdminModel;
import com.review.demo.RRepository.AdminRepository;

@Service
public class AdminService
{
	@Autowired
	AdminRepository arepo;
	
	public AdminModel saveData(AdminModel am)
	{
		return arepo.save(am);
	}
	
	public List<AdminModel> getAllData()
	{
		return arepo.findAll();
	}
	
	public Optional<AdminModel> getDataById(int id)
	{
		return arepo.findById(id);
	}
	
	public AdminModel updateData(AdminModel am)
	{
		return arepo.saveAndFlush(am);
	}
	
	public void deleteData(int id)
	{
		arepo.deleteById(id);
	}
}
