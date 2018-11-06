package EdurekaHW.module7;
public class StudentDAOAbstraction {
    public static StudentDAO getDBConnection() throws Exception{
        StudentDAO studentDAO = new StudentDAOImpl();
        return studentDAO;
    }
}
