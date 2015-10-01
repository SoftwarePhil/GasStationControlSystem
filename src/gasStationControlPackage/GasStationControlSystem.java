package gasStationControlPackage;

public class GasStationControlSystem {
	
private MessageReciver mr;

public GasStationControlSystem(){
   mr = new MessageReciver();
}

public void newMessage(String s){
	mr.newMessage(s);
}

public void processNextMessage(){
	try {
		mr.getNextMessage().messageAction();
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
}
