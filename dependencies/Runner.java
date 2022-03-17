package com.farrukhsimran.dependencies;

public class Runner {

	public static void main(String[] args) {
		HardDrive drive1 = new HardDrive("Seagate", 2048, 0);
		System.out.println(drive1);
		
		HardDrive drive2 = new HardDrive("Dell",3072, 500);
		System.out.println(drive2);
		
		Processor processor1 = new Processor("Intel Xeon",2.93,6);
		System.out.println(processor1);
		
		Processor processor2 = new Processor("Intel Celeron",2.9,2);
		System.out.println(processor2);
		
		Memory memory1 = new Memory("Kingston",4,1600);
		System.out.println(memory1);
		
		Memory memory2 = new Memory("Corsair",8,1333);
		System.out.println(memory2);
		
		PowerSource powerSource1 = new PowerSource(20.0);
		System.out.println(drive1);

		Computer computer1 = new Computer("Dell",drive1,memory1,processor1);
		System.out.println(computer1);
		
		Computer computer2 = new Computer("Lenovo",drive2,memory2,processor2);
		System.out.println(computer2);

		computer1.getPower(powerSource1);
		
		ComputerStore computers = new ComputerStore("Computers");
		computers.addComputer(computer1);
		computers.addComputer(computer2);
		computers.getAllComputers();
	}
}