package com.farrukhsimran.dependencies;

import java.util.ArrayList;

public class ComputerStore {
	private String name;
	private ArrayList<Computer> computers = new ArrayList<Computer>();

	//Constructor
	public ComputerStore(String name){
		this.name = name;
		}
		
	//getters
	public String getName() {
		return name;
		}
	//setters
	public void setName(String name) {
		this.name = name;
		}
	
	//add computer
	public void addComputer(Computer computer) {
		computers.add(computer);
	}
	
	//get all computers
	public ArrayList<Computer> getAllComputers(){
		return(computers);
	}
}
