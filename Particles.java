
public class Particles {
	String name;
	double mass;
	int charge;
	double spin;
	

	public Particles(String name) {
		this.name = name;
}
	
	public void particleMass(double d) {
		mass = d;
	}
	
	public void particleCharge(int particleCharge) {
		charge = particleCharge;
	}
	
	public void particleSpin(double d) {
		spin = d;
	}
	
	public void printParticles() {
		System.out.println("Name: " + name);
		System.out.println("Mass: " + mass + "MeV");
		System.out.println("Charge: " + charge);
		System.out.println("Spin: " + spin);
	}
	
}	