package jdbcDemo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TraineeTeamManager {
	public static void main(String[] args) throws SQLException {
		Trainee trainee=new Trainee();
		trainee.setTaineeId(3);
		trainee.setTraineeName("anu");
		trainee.setSalary(200000);
		
		
		
		
		
		
		
		TeamManager tm=new TeamManager();
		tm.showDetailsOfTrainees();
		//tm.addTrainee(trainee);
		//tm.deleteTrainee(23);
		//tm.UpdateTrainee(trainee);
		//tm.getTraineeById(trainee);
		
		
	}

}
