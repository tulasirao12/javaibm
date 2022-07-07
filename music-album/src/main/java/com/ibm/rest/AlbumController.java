package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Album;
import com.ibm.service.AlbumService;

@RestController
public class AlbumController {
	@Autowired
	AlbumService service;
	@PostMapping(value = "/add", consumes = "json/application")
	public String save(@RequestBody Album a) {
		int id = service.save(a);
		return "Album added with id: "+id;
	}
	@GetMapping(value ="/get/{id}", produces = "json/application")
	public Album fetch(int id) {
		return service.fetch(id);
	}
	@GetMapping(value = "/list", produces = "json/application")
	public List<Album> list(){
		return service.list();
	}
	@GetMapping(value = "/artist/{artist}", produces = "json/application")
	public List<Album> listByArtist(@PathVariable String artist){
		return service.byArtist(artist);
	}
	@GetMapping(value = "/genre/{genre}", produces = "json/application")
	public List<Album> listByGenre(@PathVariable String genre){
		return service.byGenre(genre);
	}
}
