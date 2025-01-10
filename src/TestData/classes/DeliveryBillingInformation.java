package TestData.classes;

import Utils.Reader;

public class DeliveryBillingInformation  //made for test 23 but it wouldn`t read the json I created with objectMapper
{
 private String zipCode;
 private String country;
 private String addr2;
 private String addr1;
 private String city;
 private String mobile;
 private String company;
 private String state;
 private String titleAndName;
 
 public DeliveryBillingInformation(String info)
 {
	 this.zipCode=Reader.json(info).get("zip").toString();
	 this.country=Reader.json(info).get("country").toString();
	 this.addr2=Reader.json(info).get("addr2").toString();
	 this.addr1=Reader.json(info).get("addr1").toString();
	 this.city=Reader.json(info).get("city").toString();
	 this.mobile=Reader.json(info).get("mobile").toString();
	 this.company=Reader.json(info).get("company").toString();
	 this.state=Reader.json(info).get("state").toString();
	 this.titleAndName=Reader.json(info).get("title").toString();
 }
 
public String getZipCode() {
	return zipCode;
}
public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getAddr2() {
	return addr2;
}
public void setAddr2(String addr2) {
	this.addr2 = addr2;
}
public String getAddr1() {
	return addr1;
}
public void setAddr1(String addr1) {
	this.addr1 = addr1;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getTitleAndName() {
	return titleAndName;
}
public void setTitleAndName(String titleAndName) {
	this.titleAndName = titleAndName;
}

 

 
}
