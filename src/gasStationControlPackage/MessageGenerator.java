package gasStationControlPackage;

import messagePackage.*;

public class MessageGenerator {
	
public Message generateMessage(String s) throws Exception{
	if(s.contains("CreditCardReader")){
	String a = s.replace("CreditCardReader ", "");
	return new CreditCardReader(a);
	}
	else throw new Exception("invalid message requested");
}
}
