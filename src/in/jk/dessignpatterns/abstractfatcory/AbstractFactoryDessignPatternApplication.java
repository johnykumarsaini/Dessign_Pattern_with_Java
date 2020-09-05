package in.jk.dessignpatterns.abstractfatcory;

public class AbstractFactoryDessignPatternApplication {
	
	public static void main(String[] args) {
		
		LoanFactory loanFactory = FactoryCreator.creatorFactory("LoanFactory");
		
		Loan bussinessLoan = loanFactory.getLoan("BussinessLoan");
		System.out.println("BussinessLoan :: "+bussinessLoan.getLoan());
		Loan educationalLoan = loanFactory.getLoan("EducationalLoan");
		System.out.println("EducationalLoan :: "+educationalLoan.getLoan());

		
	}

}
