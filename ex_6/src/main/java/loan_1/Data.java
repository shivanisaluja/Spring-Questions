package loan_1;

public class Data implements iData{
  private int income;
  private int assets;
  private int liability;
  private String education;
  private String adhar;
  private String pan;
  
  
  //private Validators v;
  public void validate() throws Validators {
	  //v.isValidEmail(email);
	  Validators.isValidPAN(pan);
	  Validators.isValidAadhar(adhar);
	  
  }
  
  
  
  
public int getIncome() {
	return income;
}


public void setIncome(int income) {
	this.income = income;
}

public int getAssets() {
	return assets;
}


public void setAssets(int assets) {
	this.assets = assets;
}


public int getLiability() {
	return liability;
}



public void setLiability(int liability) {
	this.liability = liability;
}



public String getEducation() {
	return education;
}



public void setEducation(String education) {
	this.education = education;
}



public String getAdhar() {
	return adhar;
}

public void setAdhar(String adhar) {
	this.adhar = adhar;
}

public String getPan() {
	return pan;
}

public void setPan(String pan) {
	this.pan = pan;
}



public int generateIncome() {
	int getIncome = getIncome()+getAssets()-getLiability();
	return getIncome;
}


@Override
public String toString() {
	return "DataEntry [income=" + income + ", assets=" + assets + ", liability=" + liability + ", education="
			+ education + ", adhar=" + adhar + ", pan=" + pan + "]";
}


  
}
