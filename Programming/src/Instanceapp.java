import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Instanceapp {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("hello1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result1.txt");
		p2.write("hello2");
		p2.close();
		
		
		
		
	}

}
