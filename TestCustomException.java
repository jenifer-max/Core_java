class InvalidNameException extends RuntimeException{
    public InvalidNameException(String message) {
        super(message);
    }
}
public class TestCustomException {
    static void validate(String name) throws InvalidNameException{
        if(name.length()<=4){
        throw new InvalidNameException("Name not allowed");
        }
        else{
        System.out.println("Ok");
    }
        }
    public static void main(String args[]) {
        try{
            validate("Ajay");
        }catch(InvalidNameException e){
        System.out.println("Exception caught: " + e.getMessage());
    }
}
}