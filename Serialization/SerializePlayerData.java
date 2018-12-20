//serialization class for PlayerData

import java.io.*;

public class SerializePlayerData {

	public static void main(String[] args) {
		PlayerData obj = new PlayerData(33, 29, "Tobias", 500000, .289);
		try {
			FileOutputStream fos = new FileOutputStream("/Users/mitchleers/eclipse-workspace/SerialTeamData/src/PlayerData.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			fos.close();
			System.out.println("Serialization completed.  Run deserialize to read.");
		}catch(IOException ioe){
			System.out.println(ioe);
		}
	}

}