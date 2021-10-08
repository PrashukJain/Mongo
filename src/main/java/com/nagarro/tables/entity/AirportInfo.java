package com.nagarro.tables.entity;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection ="AirportInfo")
public class AirportInfo {
	@Id
private String airportId;
private String city;
private String country;
private String iata;
private String icao;
private String timezone;
private String title;
private Date validFrom;
private Date validTo;

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getIata() {
	return iata;
}
public void setIata(String iata) {
	this.iata = iata;
}
public String getIcao() {
	return icao;
}
public void setIcao(String icao) {
	this.icao = icao;
}
public String getTimezone() {
	return timezone;
}
public void setTimezone(String timezone) {
	this.timezone = timezone;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Date getValidFrom() {
	return validFrom;
}
public void setValidFrom(Date validFrom) {
	this.validFrom = validFrom;
}
public Date getValidTo() {
	return validTo;
}
public void setValidTo(Date validTo) {
	this.validTo = validTo;
}
@Override
public String toString() {
	return "AirportInfo [city=" + city + ", country=" + country + ", iata=" + iata + ", icao=" + icao + ", timezone="
			+ timezone + ", title=" + title + ", validFrom=" + validFrom + ", validTo=" + validTo + "]";
}
public String getAirportId() {
	return this.airportId;
}
public void setAirportId(String airportId) {
	this.airportId = airportId;
}

}
