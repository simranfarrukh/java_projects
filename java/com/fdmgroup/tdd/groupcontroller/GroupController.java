package com.fdmgroup.tdd.groupcontroller;

import java.util.Map;

public class GroupController implements GroupControllerService {

	private DatabaseReader reader;
	private DatabaseWriter writer;
	
	public GroupController(DatabaseReader reader, DatabaseWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}

	public Map<String, Trainee> getAllTrainees() {
		return reader.readGroup();
	}

	public void addTrainee(Trainee trainee) {
		writer.addTrainee(trainee);
	}

	public void removeTraineeByUsername(String traineeUsername) {
		writer.deleteTraineeByUsername(traineeUsername);		
	}
}
