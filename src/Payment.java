
public class Payment {
	public double amount;
	
	
	public Payment() {
		amount = 5000;
	}
	public Payment(double p) {
		p=amount;
		
	}


	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String PaymentDetails() {
		return "Amount is Five Thousand";
	}
	
	

}
