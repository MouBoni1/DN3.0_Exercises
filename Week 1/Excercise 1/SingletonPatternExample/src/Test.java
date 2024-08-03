public class Test {
    public static void main(String[] args){

        Logger logger1 = Logger.getInstance();//calls the getInstance method from logger class and assign it to logger1 
        

        Logger logger2 = Logger.getInstance();//calls the getInstance method from logger class and assign it to logger2
        

        if (logger1 == logger2) { //if both objects are same
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("logger1 and logger2 refer to different instances.");
        }
    }
}
