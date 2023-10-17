import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class JDBCStoredProcedure {

	public static void main(String[] args) {
		Connection con=null;
		
		try {
			
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/learning_db","root" , "Aug@2023$");
//			CallableStatement cs= con.prepareCall("{call updateEmpSalary(?,?)}");
//			cs.setInt(1, 102);
//			cs.setInt(2, 1);
//			cs.executeUpdate();
//			System.out.println("Updated Successfully");
			
//			CallableStatement cs= con.prepareCall("{call countEmp(?)}");
//			cs.registerOutParameter(1, Types.INTEGER);
//			cs.execute();
//			System.out.println("Number of employees: "+ cs.getInt(1));
			
			CallableStatement cs= con.prepareCall("{call fetchsalary(?,?,?)}");
//			//cs.registerOutParameter(1, Types.INTEGER);
//			
			cs.setInt(1,103);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.registerOutParameter(3, Types.VARCHAR);
			cs.execute();
			System.out.println("Existing Salary "+cs.getString(2)+ "\nUpdated Salary "+ cs.getString(3));
			
//			CallableStatement cs= con.prepareCall("{call incCounter(?)}");
//			cs.registerOutParameter(1, Types.INTEGER);
//			cs.setInt(1, 3);
//			cs.execute();
//			System.out.println("Number of employees: "+ cs.getInt(1));
			
//			CallableStatement cs=con.prepareCall("{?=call isPrime(?)}");
//            cs.registerOutParameter(1, Types.BOOLEAN);
//            cs.setInt(2,6);
//            cs.execute();
//            System.out.println("Result : "+cs.getInt(1));
//            
//            if (cs.getInt(1)==1) {
//            	System.out.println("Is a Prime Number");
//            }else {
//            	System.out.println("Not a Prime Number");
//
//            }

			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
