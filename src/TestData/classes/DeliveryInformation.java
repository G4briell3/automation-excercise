package TestData.classes;

import Utils.Reader;

public class DeliveryInformation
{
 private String deliveryAddress;
 private String billingAddress;
 public DeliveryInformation(String information)
 {
	 this.deliveryAddress=Reader.json(information).get("delivery address").toString();
	 this.billingAddress=Reader.json(information).get("billing addrress").toString();
 }
 
public String getDeliveryAddress() {
	return deliveryAddress;
}
public void setDeliveryAddress(String deliveryAddress) {
	this.deliveryAddress = deliveryAddress;
}
public String getBillingAddress() {
	return billingAddress;
}
public void setBillingAddress(String billingAddress) {
	this.billingAddress = billingAddress;
}
 
}
