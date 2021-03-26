package loan_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class NewLoan {
	
	//used interface 
	private iSourcing sourcing;
	private iData de;
	
	private address add;
	

	public address getAdd() {
		return add;
	}

	public void setAdd(address add) {
		this.add = add;
	}
	
	
	public iData getDe() {
		return de;
	}

	public void setDe(iData de) {
		this.de = de;
	}

	public iSourcing getSourcing() {
		return sourcing;
	}

	public void setSourcing(iSourcing sourcing) {
		this.sourcing = sourcing;
	}
	
	
	// read the input from the loan.txt file and checks if the data that we have input from
	//spring.xml file is present in the loan.txt file or not 
	//if present returns "true"
	//if notpresent returns "false"
	
	
	@SuppressWarnings("unused")
	public boolean loanStatus(iData de,iSourcing sourcing) throws IOException {
		boolean status = true;
		String loanInfo = de.getAdhar()+de.getPan()+sourcing.getPhoneNum() + sourcing.getEmail();
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\shiva\\eclipsework\\ex_6\\src\\main\\java\\loan_1\\Loan.txt"));
		String line1 = reader1.readLine();
		  
	         
	        while (line1 != null)
	        {
	            if(line1 == null)
	            {
	            	status = false;
	            	break;
	            }
	            else 
	            	
	            if(!line1.equalsIgnoreCase(loanInfo))
	            {
	                status = false;
	                 
	                break;
	            }
	             
	            line1 = reader1.readLine();
	            
	        }
	        reader1.close();
		return status;
	}
	
//	public boolean updatingloanStatus(DataEntry de,Sourcing sourcing) throws IOException {
//		boolean status = false;
//		String loanInfo = de.getAdhar()+de.getPan()+sourcing.getPhoneNum() + sourcing.getEmail();
//		BufferedWriter writer_1 = new BufferedWriter(new FileWriter("/Users/jerry/Documents/java/spring_maven/first/src/main/java/loan_1/Loan.txt"));
	
	
	
//		 writer_1.write(loanInfo);
	
	
	
//		 status=true;
//		return status;
//	}
	
	
	//generate app no.
	public String generate() {
		
		Random ra = new Random(); 
		 
		 int r = ra.nextInt(100);
		 String n=sourcing.getPhoneNum()+r;
		 return n;
	}
	

}
