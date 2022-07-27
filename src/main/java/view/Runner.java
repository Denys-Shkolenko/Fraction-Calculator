package view;

public class Runner {

    public static Calculator frame;

    public static void main(String[] args) {
        frame = Calculator.getInstance("Fraction Calculator");
        frame.setVisible(true);
    }
}
