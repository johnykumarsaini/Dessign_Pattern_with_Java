package in.jk.dessignpatterns.abstractfatcory;

public class FactoryCreator {

	public static LoanFactory creatorFactory(String factoryType) {

		LoanFactory loanFactory = null;
		if ("LoanFactory".equals(factoryType)) {
			loanFactory = new LoanFactoryImpl();
		}
		return loanFactory;

	}

}
