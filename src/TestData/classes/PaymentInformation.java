package TestData.classes;

import Utils.Reader;

public class PaymentInformation 
{
  private String enterNameOnCard;
  private String enterCardNumber;
  private String enterCvc;
  private String enterExpirationMonth;
  private String enterExpirationYear;
  
  public PaymentInformation(String details)
  {
	  this.enterNameOnCard=Reader.json(details).get("name").toString();
	  this.enterCardNumber=Reader.json(details).get("card number").toString();
	  this.enterCvc=Reader.json(details).get("cvc").toString();
	  this.enterExpirationMonth=Reader.json(details).get("expiration month").toString();
	  this.enterExpirationYear=Reader.json(details).get("expiration year").toString();
  }
public String getEnterNameOnCard() {
	return enterNameOnCard;
}
public void setEnterNameOnCard(String enterNameOnCard) {
	this.enterNameOnCard = enterNameOnCard;
}
public String getEnterCardNumber() {
	return enterCardNumber;
}
public void setEnterCardNumber(String enterCardNumber) {
	this.enterCardNumber = enterCardNumber;
}
public String getEnterCvc() {
	return enterCvc;
}
public void setEnterCvc(String enterCvc) {
	this.enterCvc = enterCvc;
}
public String getEnterExpirationMonth() {
	return enterExpirationMonth;
}
public void setEnterExpirationMonth(String enterExpirationMonth) {
	this.enterExpirationMonth = enterExpirationMonth;
}
public String getEnterExpirationYear() {
	return enterExpirationYear;
}
public void setEnterExpirationYear(String enterExpirationYear) {
	this.enterExpirationYear = enterExpirationYear;
}
  
}
