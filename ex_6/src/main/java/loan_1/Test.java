package loan_1;

//import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		try {
			// loading the beans from spring.xml file
		NewLoan NL = context.getBean("newLoan",NewLoan.class);
		
		iData NL1 = context.getBean("de",Data.class);
		
		iSourcing NL2 = context.getBean("sourcing",Source.class);
		
		scoring NL3 = context.getBean("score",scoring.class);
		
		System.out.printf("\n\n\n\n");
	    System.out.printf("============*************************==============\n");
	    System.out.printf("|                    WELCOME TO                   |\n");
	    System.out.printf("|            ---------------------------          |\n");
	    System.out.printf("|             loan management system              |\n");
	    System.out.printf("|           -----------------------------         |\n");
	    System.out.printf("|                                                 |\n");
	   
	    System.out.printf("============***************************============\n"+"\n\n");
		
		 
		 
		System.out.println("data entry part is  :\n"+NL.getSourcing());
		
		System.out.println("\n*************************************");
		
		//calling to genereate an unique application number in newloan method..
		System.out.println("app  number :" + NL.generate());
		
		System.out.println("\n*************************************\n");
		
		System.out.println("personal info :\n"+NL.getDe());
		

		System.out.println("\n*************************************\n");
		
		System.out.println("\naddress injection : "+NL.getAdd());
		
		System.out.println("\n*************************************");
		
		//validating the details... of the "dataentry" class
		System.out.println("validating the details...\n");
		NL.getDe().validate();
		
		System.out.println("\n*************************************\n");
		
		System.out.println("\nactual_income : "+NL.getDe().generateIncome());
		
		System.out.println("\n*************************************\n");
		
		System.out.println("if loan is  there in ur databasses :" + NL.loanStatus(NL.getDe(), NL.getSourcing()));
		
		
		if(NL.loanStatus(NL.getDe(), NL.getSourcing())){
			System.out.println("sry  :(");
		}else {
			System.out.println("congratulations!! :)");
		}
		
		
		System.out.println("Your credit score is "+ NL3.Scoring(NL1 ,NL2));
		
		//note that this will be printed only when there is no exception being thrown through some of exception...
		System.out.println("\nScoring_is_done!!");
		
		}catch(Exception E){
			System.out.println(E);
		}
		
	
		System.out.println("\n*************************************\n");
		
		((ClassPathXmlApplicationContext) context).close();
		
	}

}
