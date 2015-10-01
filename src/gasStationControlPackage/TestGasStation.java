package gasStationControlPackage;


public class TestGasStation {
public static void main(String[] args){
	
	GasStationControlSystem gs = new GasStationControlSystem(); 
	gs.newMessage("CreditCardReader 123457 420.3");
	gs.processNextMessage();
}
}
