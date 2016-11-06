import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class GuessNode implements DecisionNode{

	public String value;
	public DecisionNode right;
	public DecisionNode left;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public GuessNode(String val) {
		this.value = val;
		this.right = null;
		this.left = null;
	}

	@Override
	public int countObjects() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DecisionNode guess(Scanner in) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write(FileWriter out) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
