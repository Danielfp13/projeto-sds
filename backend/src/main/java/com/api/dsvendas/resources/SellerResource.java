package com.api.dsvendas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.dsvendas.dto.SellerDTO;
import com.api.dsvendas.services.SellerService;

@RestController
@RequestMapping("/sellers")
public class SellerResource {
	
	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll(){
		List<SellerDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
