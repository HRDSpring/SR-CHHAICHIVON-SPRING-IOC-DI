package com.SR.CHHAICHIVON.SPRING.IOC.DI.model;

import java.util.ArrayList;

public class VideoDAO {
	
	public ArrayList<VideoDTO> getAllVideo(){
		ArrayList<VideoDTO> dao = new ArrayList<VideoDTO>();
		VideoDTO dto = new VideoDTO();
		for(int i = 0; i<10;i++){
			dto.setId(i);
			dto.setName("Name"+i);
			dao.add(dto);
		}
	return dao;
	}

}
