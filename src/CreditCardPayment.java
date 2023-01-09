
public class CreditCardPayment extends Payment {
	public String NameOnCard;
	public String ExpirationDate;
	public int CardNumber;
	
	public CreditCardPayment() {
		super();
		NameOnCard="Hizbullah Bhatti";
		ExpirationDate="12-1-2027";
		CardNumber = 453231232;
	}
	
	public String PaymentDetails() {
		return "Name "+NameOnCard + " ExpirationDate "+ExpirationDate+" CardNumber "+CardNumber;		
		
	}

	@Override
	public String toString() {
		return "Name of Owner of Card: "+NameOnCard+" ExpirationDate: " + ExpirationDate + " CardNumber: "
				+ CardNumber + " amount: " + amount;
	}
	
	
	

	
	
	
	
	
	

}
