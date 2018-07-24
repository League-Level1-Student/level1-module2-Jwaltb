import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		Microwave micro = new Microwave();
		String flavor = JOptionPane.showInputDialog("What flavor of popcorn would you like?");
		Popcorn P = new Popcorn(flavor);
		String time = JOptionPane.showInputDialog("How many minutes do you want to cook your popcorn for?");
		int num = Integer.parseInt(time);
		micro.setTime(num);
		micro.putInMicrowave(P);
		micro.startMicrowave();
	}
}
