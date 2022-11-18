import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
//This code uses Radix Sort while showing how it would look to sort and array (using heap).
//In this, we show the first 10 digits to give you an example of what is being done behind the scenes.
//The first 10 digits (of the random array) show 100000 random integers.
//The first 10 digits (of the sorted array) show the 100000 random integers in a sorted way/array.
//The execution time is shown with all of this.
public class Heapsort {

	public static List<Movie> create() throws FileNotFoundException {// creates new list of movies based on log files
		File names = new File("MOVIE-master/names.log");
		File ids = new File("MOVIE-master/ids.log");
		File years = new File("MOVIE-master/year.log");

		//System.out.println(names.exists());

		Scanner sc2 = new Scanner(ids);
		Scanner sc3 = new Scanner(years);
		Scanner sc = new Scanner(names);


		List<Movie> hold = new ArrayList<>();
		//System.out.println(sc.nextLine());
		//sc.
		while (sc.hasNext()) {
			{

				Movie c = new Movie(sc2.nextInt(), sc.nextLine(), sc3.nextInt());
				//c.print(c);
				hold.add(c);

			}
		}

		return hold;
	}

	public static void main (String args[]) throws FileNotFoundException {



		ArrayList<Movie> ints = new ArrayList <Movie>(create());



		//sort(ints);

		for (Movie o : ints) {
			//o.print(o);
			System.out.println(o.movid);
		}

		System.out.println(" heapsorted array below");

		Heapsort obj = new Heapsort();
		Heapsort.sort(ints);

		System.out.println("done ");
		for (Movie o : ints) {
			//o.print(o);
			System.out.println(o.movid);
		}
	}


	//printInts(ints);






	public static void sort(ArrayList<Movie> ints) {
		int num = ints.size()-1;

		for (int i = num / 2 - 1; i >= 0; i--) {
			makeHeap(ints, num, i);
		}

		for (int i = num - 1; i >= 0; i--) {
			Movie temp = ints.get(0);
			ints.set(0,ints.get(1));
			ints.set(0,temp);

			makeHeap(ints, i, 0);
		}

	}


	public static void makeHeap (ArrayList<Movie> ints, int num, int i) {
		int most = i;
		int leftS = 2 * i + 1;
		int rightS = 2 * i + 2;

		if (leftS < num && ints.get(leftS).movid > ints.get(most).movid) {
			most = leftS;
		}

		if (rightS < num && ints.get(rightS).movid > ints.get(most).movid) {
			most = rightS;
		}

		if (most != i) {
			Movie swap = ints.get(i);
			ints.set(0,ints.get(i));
			ints.set(0,swap);
			ints.get(i).setMovname("gg");
			ints.get(num).setMovname("gg");

			//			if (most!=-1) {
			//				System.out.println(num+"hhh"+ints.indexOf(most));
			makeHeap(ints, num, most);
			//}

		}
		//		for (Movie o : ints) {
		//			o.print(o);
		//			System.out.println(o.movid);
		//		}
	}


	//	public static void printInts(int ints[]) {
	//		int num = ints.length;
	//		
	//		
	//			System.out.print(ints[i] + " ");
	//	}
}
