//This is the generic MyHeap Class that implements MyQueue
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyHeap<E> implements MyQueue<E> {

	private ArrayList<E> list;

	public MyHeap() {
		list = new ArrayList<E>();
	}

	public void addMovie(E movie) {
		list.add(movie);
	}

	public void clearAll() {
		list.clear();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public E peekMovie() {
		return list.get(0);
	}

	public void pushMovie(E movie) {
		list.add(0, movie);
	}

	public E removeMovie() {
		return list.remove(0);
	}

	public int size() {
		return list.size();
	}

}



