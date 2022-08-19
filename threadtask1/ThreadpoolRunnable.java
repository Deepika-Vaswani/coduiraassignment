import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks implements Runnable {
    private String message;
    public Tasks(String s){
        this.message=s;
    }
 
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " Hello India " + message);
        processmessage();   
    }
    private void processmessage() {
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }
    }
   
}
public class ThreadpoolRunnable  
{  
// Maximum number of threads in the thread pool  
static final int MAX_TH = 5;                  
  
// main method  
public static void main(String argvs[])  
{  
// Creating five new tasks  
Runnable rb1 = new Tasks("");  
Runnable rb2 = new Tasks("");  
Runnable rb3 = new Tasks("");  
Runnable rb4 = new Tasks("");  
Runnable rb5 = new Tasks("");   
  
// creating a thread pool with MAX_TH number of  
// threads size the pool size is fixed  
ExecutorService pl = Executors.newFixedThreadPool(MAX_TH);  
  
// passes the Task objects to the pool to execute (Step 3)  
pl.execute(rb1);  
pl.execute(rb2);  
pl.execute(rb3);  
pl.execute(rb4);  
pl.execute(rb5);  
  
// pool is shutdown  
pl.shutdown();    
}  
}  