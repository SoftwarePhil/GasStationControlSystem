package messagePackage;

public class CreditCardReader extends Message {

public CreditCardReader(String s){
	swipeCreditCardInfo(s.substring(0,5), Double.parseDouble(s.substring(7, s.length()-1)));
	
}
	
public void messageAction(){
	sentCardInfo(message);
}

public void swipeCreditCardInfo(String creditCardNumber, double purchaseAmount){
	message = creditCardNumber + "||" + purchaseAmount;
}

public void sentCardInfo(String cc){
	System.out.println("The transaction has been sent to the credit card company with the "
			+ "following credit card number and amount charged " + message);
}

public String toString(){
	return "CreditCardReader";
}

}

