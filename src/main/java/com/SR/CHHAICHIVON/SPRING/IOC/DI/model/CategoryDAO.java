package com.SR.CHHAICHIVON.SPRING.IOC.DI.model;

import java.util.ArrayList;

public class CategoryDAO {
	
	public ArrayList<CategoryDTO> getAllCategory(){
		ArrayList<CategoryDTO> arr = new ArrayList<>();
		CategoryDTO  dto = new CategoryDTO();
		for(int i = 0 ; i < 10 ; i++){
			dto.setCatId(i);
			dto.setCatName("CategoryName"+i);
			arr.add(dto);
		}
		return arr;
	}
}
