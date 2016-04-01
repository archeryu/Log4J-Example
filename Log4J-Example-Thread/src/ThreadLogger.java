import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Archer.Yu
 * @since 20160328
 * <p>--------------------------------------------------------------------------------------
 * <p>a Logger with the name "test-log4j2-threads" is obtained from the LogManager. 
 * <p>Next, the logger is used to write the thread message in main, 
 * <p>however the message will be written only if the Logger is configured to allow informational messages.
 */

public class ThreadLogger {

    private static Logger logger;

    public static void init(){
        logger = LogManager.getLogger("test-log4j2-threads");
    }

    public static Logger getLogger(){
        return logger;
    }
}
