public class Logger{
    private static Logger instance;  //creating an private static instance of logger class

    private Logger(){  //creating a private constructor

    }
    public static Logger getInstance() {
        if (instance == null) {      //only if no previous objects were created
            instance = new Logger();  //create a object
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
