package threadseg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class SequenceNumberGeneratorTest {
 
	private static final int TOTAL_NUMBER_IN_SEQUENCE = 10;
	private static final int TOTAL_NUMBER_OF_THREADS = 5;
		public static void main(String[] args) {
		
		NumbersGenerator numbersGenerator = new NumbersGenerator(TOTAL_NUMBER_OF_THREADS, TOTAL_NUMBER_IN_SEQUENCE);
		
		ExecutorService executorService = null;
		try {
			executorService = Executors.newFixedThreadPool(TOTAL_NUMBER_OF_THREADS);
			executorService.submit(new SequenceGeneratorTask(numbersGenerator, 1));
			executorService.submit(new SequenceGeneratorTask(numbersGenerator, 2));
			executorService.submit(new SequenceGeneratorTask(numbersGenerator, 3));
            executorService.submit(new SequenceGeneratorTask(numbersGenerator, 4));
            executorService.submit(new SequenceGeneratorTask(numbersGenerator, 5));

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(executorService != null)
				executorService.shutdown();
		}
 
	}
}