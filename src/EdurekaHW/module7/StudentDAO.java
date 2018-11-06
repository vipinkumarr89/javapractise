package EdurekaHW.module7;
public interface StudentDAO {
     void saveStudent(Student stud) throws Exception;
     void deleteStudent(int ID) throws Exception;
     void updateStudent(Student stud)throws Exception;
     void searchStudent(int ID)throws Exception;
     void listStudents() throws Exception;
//    List<Student> getStudents() throws Exception;
}
