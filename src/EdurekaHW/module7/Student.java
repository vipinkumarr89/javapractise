package EdurekaHW.module7;
public class Student {
    private int StudentID;
    private String StudentName;
    private int StudentClass;
    private int StudentMarks;

    //Data Transfer Object
    public Student() {
        super();
    }

    public Student(int studentID, String studentName, int studentClass, int studentMarks) {
        this.StudentID = studentID;
        this.StudentName = studentName;
        this.StudentClass = studentClass;
        this.StudentMarks = studentMarks;
    }

    public int getStudentID() { return StudentID; }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getStudentClass() {
        return StudentClass;
    }

    public void setStudentClass(int studentClass) {
        StudentClass = studentClass;
    }

    public int getStudentMarks() {
        return StudentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        StudentMarks = studentMarks;
    }
}
