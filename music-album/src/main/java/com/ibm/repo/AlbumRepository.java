package com.ibm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
	List<Album> findByArtist(String artist);
	List<Album> findByGenre(String genre);
}
