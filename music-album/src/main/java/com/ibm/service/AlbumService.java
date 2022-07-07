package com.ibm.service;

import java.util.List;

import com.ibm.entity.Album;

public interface AlbumService {
	int save(Album a);
	Album fetch(int id);
	
	List<Album> list();
	
	List<Album> byArtist(String artist);
	
	List<Album> byGenre(String genre);
	
	
	
}
