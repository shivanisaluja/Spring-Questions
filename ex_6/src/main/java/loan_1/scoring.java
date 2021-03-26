package loan_1;

public class scoring {
	
	
	public int Scoring(iData de, iSourcing sourcing) {
		int score =0;
		if(sourcing.getAge()<=20) {
			score=25;
		}else if (sourcing.getAge()<30) {
			score=15;
		}
		
		if(de.getEducation().equalsIgnoreCase("grad")) {
			score =25;
		}else if(de.getEducation().equalsIgnoreCase("undergrad")) {
			score =15;
		}
		
		if(de.generateIncome()>=10000) {
			score=25;
		}else if(de.generateIncome()<10000) {
			score=20;
		}
		return score;
	}
	
	
	

}
