//de-serialization class for PlayerData

import java.io.*;

public class DeserializePlayerData {

	public static void main(String[] args) {
	PlayerData pd = null;  
	try {
		FileInputStream fis = new FileInputStream("PlayerData.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		pd = (PlayerData)ois.readObject();
		ois.close();
		fis.close();	
		
	}catch(IOException ioe) {
		System.out.println("File not found");
		ioe.printStackTrace();
		return;
	}catch(ClassNotFoundException cnfe) {
		System.out.println("PlayerData Class not found.");
		cnfe.printStackTrace();
		return;
	}
	
	System.out.println("Player name: "+ pd.getplayerName());
    System.out.println("Player age: "+ pd.getPlayerAge());
    System.out.println("Player jersey number: "+ pd.getplayerJerseyNum());
    System.out.println("Player salary: "+ pd.getplayerSalary());
    System.out.println("Player batting avg.: "+ pd.getplayerBatAvg());
	
	}

}
