package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ShowsRepository extends JpaRepository<Shows,Integer>{
	
	@Query(value="select s from Shows s where s.screen.screenid=:screenid")
	public List<Shows> findByScreen(@Param(value="screenid")int screenid);


}
