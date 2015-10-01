package gasStationControlPackage;

import messagePackage.*;

public class MessageGenerator {
	
public Message generateMessage(String s) throws Exception{
	String temp;
	if(s.contains("CreditCardReader")){
	temp = s.replace("CreditCardReader ", "");
	return new CreditCardReader(temp);
	}
	else throw new Exception("invalid message requested");
}
}
