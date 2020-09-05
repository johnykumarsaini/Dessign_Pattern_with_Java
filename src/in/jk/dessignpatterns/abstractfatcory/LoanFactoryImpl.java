package in.jk.dessignpatterns.abstractfatcory;

public class LoanFactoryImpl implements LoanFactory {

	@Override
	public Loan getLoan(String loanType) {
		
		Loan loan=null;
		
		if("BussinessLoan".equals(loanType))
			loan = new BussinessLoan();	
		
		if("EducationalLoan".equals(loanType))
			loan = new EducationalLoan();	
		
		return loan;
	}

}
