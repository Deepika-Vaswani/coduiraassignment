import java.util.*;

public class queueeg {
	public static void main(String[] args)
		throws IllegalStateException
	{

		Queue<Integer> q
			= new ArrayDeque<Integer>();

		q.add(78);
		q.add(86);
		q.add(67);
		q.add(93);
		q.add(55);
		q.add(99);
		System.out.println("Queue: " + q);

		System.out.println("Deleted elemet is: " + q.remove());
		System.out.println("Deleted elemet is: " + q.remove());
	}
}
