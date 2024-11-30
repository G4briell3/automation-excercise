package TestData.classes;

import Utils.Reader;

public class EnterInformation 
{
 private String username;
 private String email;
 private String password;
 private String firstName;
 private String lastName;
 private String company;
 private String address;
 private String address2;
 private String state;
 private String city;
 private String zipCode;
 private String mobileNumber;
 
 public EnterInformation(String details)
 {
	 this.username=Reader.json(details).get("name").toString();
	 this.email=Reader.json(details).get("email").toString();
	 this.password=Reader.json(details).get("password").toString();
	 this.firstName=Reader.json(details).get("first name").toString();
	 this.lastName=Reader.json(details).get("last name").toString();
	 this.company=Reader.json(details).get("company").toString();
	 this.address=Reader.json(details).get("address").toString();
	 this.address2=Reader.json(details).get("address2").toString();
	 this.state=Reader.json(details).get("state").toString();
	 this.city=Reader.json(details).get("city").toString();
	 this.zipCode=Reader.json(details).get("zip code").toString();
	 this.mobileNumber=Reader.json(details).get("mobile number").toString();
 }
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getAddress2() {
	return address2;
}
public void setAddress2(String address2) {
	this.address2 = address2;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getZipCode() {
	return zipCode;
}
public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
 
}
