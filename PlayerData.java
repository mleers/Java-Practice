//serializable data class, saved as .ser for ser/deser classes

class PlayerData implements java.io.Serializable{
	private int playerJerseyNum;
	private int playerAge;
	private String playerName;
	private transient int playerSalary;  //transient makes salary non-serializable
	private transient double playerBatAvg;
	
	public PlayerData(int num, int age, String name, int salary, double bat_avg) {  //constructor for player data
		this.playerJerseyNum = num;
		this.playerAge = age;
		this.playerName = name;
		this.playerSalary = salary;
		this.playerBatAvg = bat_avg;
	}
	
	public int getplayerJerseyNum() {  //data encapsulation, getter/setter methods
		return playerJerseyNum;
	}
	
	public void setplayerJerseyNum(int playerJerseyNum) {
		this.playerJerseyNum = playerJerseyNum;
	}
	
	public int getPlayerAge() {
		return playerAge;
	}

	public void setplayerAge(int playerAge) {
		this.playerAge = playerAge;
	}
	
	public String getplayerName() {
		return playerName;
	}
	
	public void setplayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public int getplayerSalary() {
		return playerSalary;
	}
	
	public void setplayerSalary(int playerSalary) {
		this.playerSalary = playerSalary;
	}
	
	public double getplayerBatAvg() {
		return playerBatAvg;
	}
	
	public void setplayerBatAvg(int playerBatAvg) {
		this.playerBatAvg = playerBatAvg;
	}
}








