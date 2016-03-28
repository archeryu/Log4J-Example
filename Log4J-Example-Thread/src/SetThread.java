import org.apache.logging.log4j.ThreadContext;

/**
 * @author Archer.Yu
 * @since 20160328
 */

public class SetThread extends Thread implements Runnable {

    private final String threadName;

    public SetThread(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(threadName);//Set thread name by we define.
        ThreadContext.put("logFilename",   Thread.currentThread().getName());

        ThreadLogger.getLogger().debug("Starting new loop");

        long threadId = Thread.currentThread().getId();
        
        for ( int i = 0; i < 3; i++){ 
        	ThreadLogger.getLogger().warn("Thread number: " + threadId + " message number " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            	ThreadLogger.getLogger().error(e.toString(),e);
            }
        }
    }
}
