package messagePackage;

import java.util.ArrayList;

public abstract class Message {

protected String message;
private static ArrayList<String> listOfMessageTypes;

public abstract void messageAction();

}