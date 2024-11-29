import javax.swing.JOptionPane;

public class MakeTriangle {
    public static void main(String[] args) {
        String strHeight = JOptionPane.showInputDialog(null, 
                "Enter the height of the triangle:", 
                "Triangle Height", 
                JOptionPane.INFORMATION_MESSAGE);
        
        int height = Integer.parseInt(strHeight);

        StringBuilder triangle = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                triangle.append(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                triangle.append("*");
            }
            triangle.append("\n");
        }

        JOptionPane.showMessageDialog(null, triangle.toString(), 
                "Triangle", JOptionPane.INFORMATION_MESSAGE);
    }
}
