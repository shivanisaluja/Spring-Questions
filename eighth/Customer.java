package eighth;

import java.util.*;

public class Customer {
private List<String> names=new Vector<String>();
private Set<Long> Phno;
private Map<Long, String> aadharNo;
private Map<Long, Address> address;
private Properties email;

public List<String> getNames() {
	return names;
}

@Override
public String toString() {
	return "Customer [names=" + names + ",\n Phno=" + Phno + ",\n aadharNo=" + aadharNo + ",\n address=" + address
			+ ",\n email=" + email + "]";
}

public void setNames(List<String> names) {
	this.names = names;
}
public Set<Long> getPhno() {
	return Phno;
}
public void setPhno(Set<Long> phno) {
	Phno = phno;
}
public Map<Long, String> getAadharNo() {
	return aadharNo;
}
public void setAadharNo(Map<Long, String> aadharNo) {
	this.aadharNo = aadharNo;
}


public Properties getEmail() {
	return email;
}


public void setEmail(Properties email) {
	this.email = email;
}
public Map<Long, Address> getAddress() {
	return address;
}
public void setAddress(Map<Long, Address> address) {
	this.address = address;
}


}
