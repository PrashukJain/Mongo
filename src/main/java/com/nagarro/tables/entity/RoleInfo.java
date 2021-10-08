package com.nagarro.tables.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RoleInfo {
	@Id
private String id;
private String role;
private String scope;
private String functionRole;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getScope() {
	return scope;
}
public void setScope(String scope) {
	this.scope = scope;
}
public String getFunctionRole() {
	return functionRole;
}
public void setFunctionRole(String functionRole) {
	this.functionRole = functionRole;
}
}
