package TestData.classes;

import Utils.Reader;

public class WriteReview 
{
  private String nameField;
  private String emailField;
  private String reviewField;
  
  public WriteReview(String details)
  {
	this.nameField=Reader.json(details).get("name").toString();
	this.emailField=Reader.json(details).get("email").toString();
	this.reviewField=Reader.json(details).get("review").toString();
  }
public String getNameField() {
	return nameField;
}
public void setNameField(String nameField) {
	this.nameField = nameField;
}
public String getEmailField() {
	return emailField;
}
public void setEmailField(String emailField) {
	this.emailField = emailField;
}
public String getReviewField() {
	return reviewField;
}
public void setReviewField(String reviewField) {
	this.reviewField = reviewField;
}
  
}
