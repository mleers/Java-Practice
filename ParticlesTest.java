//Test class for Particles.java
public class ParticlesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Particles partOne = new Particles("Electron");
			Particles partTwo = new Particles("Proton");
			Particles partThree = new Particles("Neutron");
			
			partOne.particleMass(.511);
			partOne.particleCharge(-1);
			partOne.particleSpin(.5);
			partOne.printParticles();
			
			partTwo.particleMass(938);
			partTwo.particleCharge(1);
			partTwo.particleSpin(.5);
			partTwo.printParticles();
			
			partThree.particleMass(940);
			partThree.particleCharge(0);
			partThree.particleSpin(.5);
			partThree.printParticles();
				
			
	}

}
