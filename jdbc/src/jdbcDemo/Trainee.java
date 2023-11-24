package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Trainee {
	private int traineeId;
	private String traineeName;
	private double salary;
	
	public int getTaineeId() {
		return traineeId;
	}
	public void setTaineeId(int taineeId) {
		this.traineeId = taineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	

}
