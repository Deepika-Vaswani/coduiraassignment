import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private String message;
    public WorkerThread(String s){
        this.message=s;
    }
 
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Hello All "+message);
        processmessage();   
    }
    private void processmessage() {
        try {  Thread.sleep(1000);  } catch (InterruptedException e) { e.printStackTrace(); }
    }
   
}
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            Runnable worker = new WorkerThread("");
            executor.execute(worker);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
 
}