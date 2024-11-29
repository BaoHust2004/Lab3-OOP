import javax.swing.JOptionPane;

public class CalculateDouble {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog(null, 
                "Please input the first real number:", 
                "Input first number", 
                JOptionPane.INFORMATION_MESSAGE);
        
        String strNum2 = JOptionPane.showInputDialog(null, 
                "Please input the second real number:", 
                "Input second number", 
                JOptionPane.INFORMATION_MESSAGE);
        
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num2 != 0 ? num1 / num2 : Double.NaN; 
        
        String result = "Results:\n" +
                "Sum: " + sum + "\n" +
                "Difference: " + difference + "\n" +
                "Product: " + product + "\n" +
                "Quotient: " + (Double.isNaN(quotient) ? "Cannot divide by zero" : quotient);
        
        JOptionPane.showMessageDialog(null, result, "Calculation Results", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
