import org.apache.logging.log4j.ThreadContext;

/**
 * @author Archer.Yu
 * @since 20160328
 */


public class Main {

    public static void main(String[] args) {
    	//the MDC is a map which stores the context data of the particular thread where the context is running.
    	//log4j and logback all have this Class
        ThreadContext.put("logFilename","main");
        ThreadLogger.init();


        int i;
        
        ThreadLogger.getLogger().info("Started");
        SetThread newThread;
        newThread = new SetThread("test1");
        newThread.start();
        newThread = new SetThread("test2");
        newThread.start();

        for ( i = 0; i < 4; i++){
            try {

            	ThreadLogger.getLogger().debug("GUI log");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ThreadLogger.getLogger().info("Finished");
    }
}
