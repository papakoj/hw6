import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class DecisionTree {
	
	DecisionNode root;

	public int countObjects() {
		return 0;
	}
	public void guess(Scanner in) {
		;
	}
	public void write(FileWriter out) throws IOException {
		;	
	}
	
	public DecisionTree() {
		root = new GuessNode("Dog");
	}
	
	public DecisionTree(File file) throws FileNotFoundException {
		Scanner input = new Scanner(file);
		String enter = input.nextLine();
		root = new QuestionNode(enter);
		while (input.hasNextLine()) {
			enter = input.nextLine();
			if (enter.startsWith("#")) {
				root.right = new QuestionNode(enter);
			} else {
				root = new GuessNode(enter);
			}
		}
		input.close();
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
