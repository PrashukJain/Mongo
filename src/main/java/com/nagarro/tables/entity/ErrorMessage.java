package com.nagarro.tables.entity;



import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ErrorMessage {
private String id;
private String errorCode;
private String language;
private String errorMessage;
private String severity;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getErrorCode() {
	return errorCode;
}
public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public String getErrorMessage() {
	return errorMessage;
}
public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}
public String getSeverity() {
	return severity;
}
public void setSeverity(String severity) {
	this.severity = severity;
}
}
