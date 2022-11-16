//This is the generic interface MyQueue w/ 
//methods addMovie(), clearAll(), isEmpty(), peekMovie(), pushMovie(), removeMovie(), size() 
public interface MyQueue <E> {

	public void addMovie(E movie);
	public void clearAll();
	public boolean isEmpty();
	public E peekMovie();
	public void pushMovie(E movie);
	public E removeMovie();
	public int size();
}

