import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class LearningGenie {

	/**
	 * @param args
	 * @throws IOException 
	 */
//	public static void main(String[] args) {
//		DecisionTree tree = new DecisionTree();
//		System.out.println("I am the learning genie!");
//		System.out.println("I can figure out whatever you are thinking of by asking questions.");
//		System.out.println("I know 1 thing!");
//		Scanner words = new Scanner(System.in);
//		boolean go = true;
//		while (go) {
//			System.out.println("Think of an object!");
//			System.out.println("Are you thinking of a " + tree.root.toString());
//			String response = words.next();
//			if (response.equals("Yes")) {
//				System.out.println("Excellent, thanks!");
//			} else if (response.equals("No")) {
//				System.out.println("Oh no! I was wrong!");
//				System.out.println("What animal were you thinking of?");
//				String correctAns = words.next();
//				System.out.println("What is a yes/no question that distinguishes a Dog from a "+correctAns + "?");
//				System.out.println("Yes corresponds to Dog; No corresponds to "+correctAns+")");
//				String check = words.nextLine();
//				System.out.println(check);
//				System.out.println("Thanks!  I'll learn from this experience!");
//			} else {
//				System.out.println("Error.");
//			}
//			System.out.println("Do you want to continue?");
//			String cont = words.next();
//			if (cont.equals("Yes")) {
////				return;
//			} else if (cont.equals("No")) {
//				go = false;
//			} else {
//				System.out.println("Error");
//				go = false;
//			}
//		}
//		words.close();
//	}

	public static void main(String[] args) throws IOException {
		File tree = new File("data.tree");
		FileWriter outt = new FileWriter("data2.tree");
		Scanner scan = new Scanner(tree);
		while (scan.hasNext()) {
			String outie = scan.nextLine();
			System.out.println(outie);
			outt.write(outie);
			outt.write("\n");
		}
		outt.close();
		scan.close();
	}
}
