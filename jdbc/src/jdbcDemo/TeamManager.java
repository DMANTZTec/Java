package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TeamManager {
	private int teamManagerId;
	private String teamManagerName;
	public int getTeamManagerId() {
		return teamManagerId;
	}
	public void setTeamManagerId(int teamManagerId) {
		this.teamManagerId = teamManagerId;
	}
	public String getTeamManagerName() {
		return teamManagerName;
	}
	public void setTeamManagerName(String teamManagerName) {
		this.teamManagerName = teamManagerName;
	}
	
	public void addTrainee(Trainee trainee) throws SQLException {
//		try {
//			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Rakesh@1999");
//			PreparedStatement statement=connection.prepareStatement("insert into trainees values(?,?,?)");
//			statement.setInt(1,a);
//			statement.setString(2, b);
//			statement.setInt(3, c);
//			int add=statement.executeUpdate();
//			System.out.println(add+" Trainee is added");
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Rakesh@1999");
		final String INSERT_STATEMENT="insert into trainees values("+trainee.getTaineeId()+",'"+trainee.getTraineeName()+"',"+trainee.getSalary()+")";
		
		System.out.println(INSERT_STATEMENT);
		Statement  psmt=con.createStatement();
		
		psmt.executeUpdate(INSERT_STATEMENT);
		
		
		
	}
	
	public void deleteTrainee(int traineeId) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Rakesh@1999");
			PreparedStatement  psmt=con.prepareStatement("delete from trainees where traineeId=?");
			psmt.setInt(1, traineeId);
			psmt.executeUpdate();
			System.out.println("trainee record deleted successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void UpdateTrainee(Trainee trainee) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Rakesh@1999");
			PreparedStatement smt=con.prepareStatement("update  trainees set traineeName=? where traineeId=?");
			
			smt.setString(1, trainee.getTraineeName());
			smt.setInt(2, trainee.getTaineeId());
			smt.executeUpdate();
			System.out.println("trainee record updated successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void getTraineeById(Trainee trainee) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Rakesh@1999");
			PreparedStatement pstm=con.prepareStatement("select * from trainees where traineeId=?");
			pstm.setInt(1, trainee.getTaineeId());
			ResultSet result=pstm.executeQuery();
			while(result.next()) {
				int traineeId=result.getInt("traineeId");
				String traineeName=result.getString("traineeName");
				double salary=result.getDouble("salary");
				System.out.println(traineeId+" "+traineeName+" "+salary);
			}

			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void showDetailsOfTrainees() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Rakesh@1999");
			PreparedStatement statement=connection.prepareStatement("select * from trainees");
			ResultSet result=statement.executeQuery();
			
			while(result.next()) {
				int traineeId=result.getInt("traineeId");
				String traineeName=result.getString("traineeName");
				double salary=result.getDouble("salary");
				System.out.println(traineeId+" "+traineeName+" "+salary);

			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


