import javax.swing.JOptionPane;

public class SortAndCalculate {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of elements in the array:"));
        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            String strNumber = JOptionPane.showInputDialog("Enter number " + (i + 1) + ":");
            numbers[i] = Double.parseDouble(strNumber.trim());
        }

        double sum = calculateSum(numbers);
        sort(numbers);
        double average = sum / numbers.length;

        StringBuilder result = new StringBuilder("Sorted Numbers: ");
        for (double num : numbers) {
            result.append(num).append(" ");
        }
        result.append("\nSum: ").append(sum);
        result.append("\nAverage: ").append(average);

        JOptionPane.showMessageDialog(null, result.toString(), 
                "Results", JOptionPane.INFORMATION_MESSAGE);
    }

    private static double calculateSum(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    private static void sort(double[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}
