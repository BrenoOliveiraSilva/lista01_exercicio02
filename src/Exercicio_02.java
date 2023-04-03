import javax.swing.JOptionPane;

public class Exercicio_02 {
    public static void main(String[] args) {
        double number = 0;
        boolean validInput = false;

        while (!validInput) {
            String input = JOptionPane.showInputDialog(null, "Informe um número");
            try {
                number = Double.parseDouble(input);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }
        }
        JOptionPane.showMessageDialog(null, "O número informado foi " + number);
    }
}