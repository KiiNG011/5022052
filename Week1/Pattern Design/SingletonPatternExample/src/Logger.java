public class Logger {
    private Logger(){

    }
    private static class LoggerHelper {
        private static final Logger INSTANCE = new Logger();
    }
    public static Logger getLogger(){
        return LoggerHelper.INSTANCE;
    }
}
