package com.SR.CHHAICHIVON.SPRING.IOC.DI.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SR.CHHAICHIVON.SPRING.IOC.DI.model.VideoDAO;
import com.SR.CHHAICHIVON.SPRING.IOC.DI.model.VideoDTO;

@Controller
public class VideoController {
	@Autowired
	private VideoDAO dao;
	
	/*Field Injection*/
	
	
	/*Construct Injection*/
	
	
	
	
	@RequestMapping("/get")
	@ResponseBody
	public ArrayList<VideoDTO> findAllVideo(){
		return dao.getAllVideo();
	}
}
