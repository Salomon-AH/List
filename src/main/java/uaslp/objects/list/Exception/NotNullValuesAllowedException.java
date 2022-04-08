package uaslp.objects.list.Exception;

public class NotNullValuesAllowedException extends Exception{

    public NotNullValuesAllowedException(){
        super("Null values are not allowed");
    }
}
