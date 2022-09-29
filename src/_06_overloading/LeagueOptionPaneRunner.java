package _06_overloading;

public class LeagueOptionPaneRunner {
	public static void main(String[] args) {
		LeagueOptionPane l = new LeagueOptionPane();
		l.showMessageDialog("The league is the best.");
		l.showMessageDialog("The league is the best.", "It sure is!");
		l.showMessageDialog("The league is the best.", "It sure is!", "java.png");
	}
}
