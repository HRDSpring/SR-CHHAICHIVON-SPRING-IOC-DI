package com.SR.CHHAICHIVON.SPRING.IOC.DI.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SR.CHHAICHIVON.SPRING.IOC.DI.model.CategoryDAO;
import com.SR.CHHAICHIVON.SPRING.IOC.DI.model.CategoryDTO;

@Controller
public class CategoryController {
	/*---Field Injection---*/
	
	/*@Autowired
	private CategoryDAO catdao;
	*/
	
	/*---Constructor Injection---*/
	/*private CategoryDAO catdao;
	@Autowired
	public CategoryController(CategoryDAO catdao) {
		this.catdao = catdao;
	}*/
	/*---Setter Injection---*/
	private CategoryDAO catdao;
	
	@RequestMapping("/getcategory")
	@ResponseBody
	public ArrayList<CategoryDTO> findAllCategory(){
		return catdao.getAllCategory();
	}
	
	
	
	
}
