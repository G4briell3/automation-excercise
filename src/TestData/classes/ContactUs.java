package TestData.classes;

import Utils.Reader;

public class ContactUs 
{
 private String nameInput;
 private String emailInput;
 private String subjectInput;
 private String messageInput;
 
 public ContactUs(String information)
 {
	 this.nameInput=Reader.json(information).get("name").toString();
	 this.emailInput=Reader.json(information).get("email").toString();
	 this.subjectInput=Reader.json(information).get("subject").toString();
	 this.messageInput=Reader.json(information).get("message").toString();
 }
public String getNameInput() {
	return nameInput;
}
public void setNameInput(String nameInput) {
	this.nameInput = nameInput;
}
public String getEmailInput() {
	return emailInput;
}
public void setEmailInput(String emailInput) {
	this.emailInput = emailInput;
}
public String getSubjectInput() {
	return subjectInput;
}
public void setSubjectInput(String subjectInput) {
	this.subjectInput = subjectInput;
}
public String getMessageInput() {
	return messageInput;
}
public void setMessageInput(String messageInput) {
	this.messageInput = messageInput;
}
 
 
}
