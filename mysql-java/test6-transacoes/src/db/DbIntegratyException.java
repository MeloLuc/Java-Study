package db;

public class DbIntegratyException extends RuntimeException{
    
    private static final long serialVerionUID = 1L;

    public DbIntegratyException(String msg) {
        super(msg);
    }
}
