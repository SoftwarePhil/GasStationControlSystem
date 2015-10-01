package gasStationControlPackage;
import java.util.ArrayList;

import messagePackage.*;

public class MessageReciver {

private ArrayList<String> incomingMessageStrings;
private MessageGenerator mg;

public MessageReciver(){
	mg = new MessageGenerator();
	incomingMessageStrings = new ArrayList<String>();
}

public void newMessage(String s){
	incomingMessageStrings.add(s);
}

public String getNextIncomingStringMessage() throws Exception{
	if(incomingMessageStrings.size() == 0){
		throw new Exception("no messages to process"); 
	}
	
	String s = incomingMessageStrings.get(0);
	incomingMessageStrings.remove(0);
	return s;
}

public Message getNextMessage() throws Exception{
	return mg.generateMessage(getNextIncomingStringMessage());
}

}
