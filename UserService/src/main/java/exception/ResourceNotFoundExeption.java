package exception;

public class ResourceNotFoundExeption  extends RuntimeException{


    public ResourceNotFoundExeption() {
        super("Resource not found on server !!");
    }

    public ResourceNotFoundExeption(String message){
        super(message);
    }
}
