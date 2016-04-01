import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @since 20160328
 * @author Archer.Yu
 * 
 * <p>--------------------------------------------------------------------------------------
 * <p>Note: A Logger with the name "test-log4j2-threads" is obtained from the LogManager. 
 * <p>Next, the logger is used to write the thread message in main and SetThread, 
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
