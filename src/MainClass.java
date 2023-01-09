
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment pay = new Payment();
		CashPayment a = new CashPayment();
		CashPayment b = new CashPayment();
		
		CreditCardPayment card1 = new CreditCardPayment();
		CreditCardPayment card2 = new CreditCardPayment();
		
		System.out.println(a.PaymentDetails());
		System.out.println(b.PaymentDetails());
		System.out.println(card1.PaymentDetails());
		System.out.println(card2.PaymentDetails());
		System.out.println(pay.PaymentDetails());
		
		System.out.println(card1.toString());
		
		

	}

}