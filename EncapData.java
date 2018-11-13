public class EncapData {

	private String agent;
	private String pwd;
	private String location;
	private int cost;
	
	public String getAgent() {  //get methods access private variable
		return agent;
	}
	
	public String getPwd() {  
		return pwd;
	}
	
	public String getLocation() {
		return location;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setName(String newAgent) {  //access point for setting private variables
		agent = newAgent;
	}
	
	public void setPwd(String newPwd) {  
		pwd = newPwd;
	}
	
	public void setLocation(String newLocation) {
		location = newLocation;
	}
	
	public void setCost(int newCost) {
		cost = newCost;
	}
	
	public static void main(String[] args) {

		EncapData details = new EncapData();
		details.setName("Mr. Bond:");
		details.setPwd("qwerty123");
		details.setLocation("Costa Rica");
		details.setCost(10000000);
		
		System.out.println(details.getAgent());
		System.out.println("The password is: "+ details.getPwd());
		System.out.println("The location is: "+ details.getLocation());
		System.out.println("The cost is: "+ details.getCost() + " dollars.");
	}

}
