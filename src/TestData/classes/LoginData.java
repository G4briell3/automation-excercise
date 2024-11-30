package TestData.classes;

import Utils.Reader;

public class LoginData 
{
	  private String loginEmail;
	  private String loginPassword;
	  private String loginName;
	  
	  public LoginData(String data)
	  {
		  this.loginEmail=Reader.json(data).get("email").toString();
		  this.loginPassword=Reader.json(data).get("password").toString();
		  this.loginName=Reader.json(data).get("name").toString();
	  }

	public String getLoginEmail() {
		return loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	  
}
