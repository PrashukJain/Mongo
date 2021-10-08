package com.nagarro.tables.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import com.nagarro.tables.entity.AirportInfo;
import com.nagarro.tables.repository.AirportInfoRepository;

@Service
public class AirportInfoService {
	@Autowired
	private AirportInfoRepository airportRepository;
	@Autowired
private	MongoTemplate mongoTemplate;
	
public void addObject(AirportInfo objectData) {
	System.out.println("service");
	airportRepository.save(objectData);
}
public List<AirportInfo> fetchObject() {
	return airportRepository.findAll();
}
public void deleteObject(String id) {
	System.out.println("delete");
	airportRepository.deleteById(id);
}
public List<AirportInfo> fetchByCity(String city){
//	return airportRepository.getByCity(city);
	Query query=new Query().addCriteria(Criteria.where("city").is(city));
	return this.mongoTemplate.find(query, AirportInfo.class);
}
public List<AirportInfo> fetchByCountry(String country){
	Query query=new Query().addCriteria(Criteria.where("country").is(country));
	return this.mongoTemplate.find(query, AirportInfo.class);
}
public List<String> getAllCities(){
	return mongoTemplate.query(AirportInfo.class).distinct("city").as(String.class).all();
}
public List<String> getAllCountries(){

	return mongoTemplate.query(AirportInfo.class).distinct("country").as(String.class).all();
}

}
