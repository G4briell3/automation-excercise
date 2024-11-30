package TestData.classes;

import Utils.Reader;

public class SignupData 
{
  private String signupName;
  private String signupEmail;
  
  public SignupData(String name)
  {
	  this.signupName=Reader.json(name).get("name").toString();
	  this.signupEmail=Reader.json(name).get("email").toString();
  }
public String getSignupName() {
	return signupName;
}
public void setSignupName(String signupName) {
	this.signupName = signupName;
}
public String getSignupEmail() {
	return signupEmail;
}
public void setSignupEmail(String signupEmail) {
	this.signupEmail = signupEmail;
}
  
  
}
