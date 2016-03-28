import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Archer.Yu
 * @since 20160328
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
