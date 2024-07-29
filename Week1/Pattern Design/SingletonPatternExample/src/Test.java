public class Test {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();

        if(logger1 == logger2){
            System.out.println("Single Threaded test passed");
        }
        else{
            System.out.println("Single Threaded test failed");
        }

        Logger[] loggers = new Logger[2];

        Thread thread1 = new Thread(() -> loggers[0] = Logger.getLogger());
        Thread thread2 = new Thread(() -> loggers[1] = Logger.getLogger());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        if(loggers[0] == loggers[1]){
            System.out.println("Multi threaded test passed");
        }else{
            System.out.println("Multi threaded test failed");
        }
    }
}
