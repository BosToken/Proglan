public class FormatCodeException extends Exception{
    public FormatCodeException(String message){
        super(message);
    }

    public FormatCodeException(){
        super("The code must match the format");
    }
}
