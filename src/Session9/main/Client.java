package EdurekaApr28.Session9.src.co.edureka.main;

import EdurekaApr28.Session9.src.co.edureka.db.JDBCHelper;

public class Client {

	public static void main(String[] args) {
		
		EdurekaApr28.Session8.src.co.edureka.model.Student sRef = new EdurekaApr28.Session8.src.co.edureka.model.Student(0,"Leo","leo@example.com",55,"Country Homes West");
		
		// 1. Load the Driver
		JDBCHelper helper = new JDBCHelper();
		
		//2. Create the Connection
		helper.createConnection();
		
		//3. Write and Execute SQL Statement
		//helper.insertStudent(sRef);
		//helper.updateStudent(sRef);
		//helper.deleteStudent(5);
		
		/*ArrayList<Student> list = helper.retrieveStudents();
		
		for(Student stu : list){
			System.out.println(stu);
		}*/
		
		//helper.executeProcedure(sRef);
		
		helper.processBatch();
		
		//4. Close the Connection
		helper.closeConnection();

	}

}
