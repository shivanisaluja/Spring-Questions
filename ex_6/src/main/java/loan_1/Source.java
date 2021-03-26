package loan_1;

import org.springframework.stereotype.Component;

@Component("source")

public class Source implements iSourcing{
   private String fullName;
   private int age;
   private String address;
   private String phoneNum;
   private String email;
   private String loanType;
   
   private address add;
   
   
public address getAdd() {
	return add;
}
public void setAdd(address add) {
	this.add = add;
}



public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhoneNum() {
	return phoneNum;
}
public void setPhoneNum(String phoneNum) {
	this.phoneNum = phoneNum;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getLoanType() {
	return loanType;
}
public void setLoanType(String loanType) {
	this.loanType = loanType;
}
@Override
public String toString() {
	return "Sourcing [fullName=" + fullName + ", age=" + age + ", address=" + address + ", phoneNum=" + phoneNum
			+ ", email=" + email + ", loanType=" + loanType + "]";
}
   
   
}
