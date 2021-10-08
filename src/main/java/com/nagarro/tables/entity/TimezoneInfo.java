package com.nagarro.tables.entity;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TimezoneInfo {
	@Id
private String timezoneId;
private String utc;
private Date validFrom;
private Date validTo;


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
public String getUtc() {
	return utc;
}
public void setUtc(String utc) {
	this.utc = utc;
}
public String getTimezoneId() {
	return timezoneId;
}
public void setTimezoneId(String timezoneId) {
	this.timezoneId = timezoneId;
}
}
