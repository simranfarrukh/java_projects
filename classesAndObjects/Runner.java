package com.farrukhsimran.classesAndObjects;



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
	}
}