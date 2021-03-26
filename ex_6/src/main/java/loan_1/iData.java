package loan_1;

public interface iData {
	
	 void validate()  throws Validators ;
	  
	  
	  
	public int getIncome(); 

	public void setIncome(int income);

	public int getAssets();


	public void setAssets(int assets) ;


	public int getLiability(); 



	public void setLiability(int liability);



	public String getEducation();


	public void setEducation(String education);



	public String getAdhar();

	public void setAdhar(String adhar);

	public String getPan() ;

	public void setPan(String pan) ;



	public int generateIncome() ;

}
