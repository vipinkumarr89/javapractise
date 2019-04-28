package EdurekaHW.module4;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(){}
    public InvalidAgeException(String errordetails){
        super(errordetails);
    }
}