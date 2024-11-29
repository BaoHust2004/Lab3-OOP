import javax.swing.JOptionPane;

public class EquationSolve {
    public static void main(String[] args) {
        solveLinearEquation();
        solveLinearSystem();
        solveQuadraticEquation();
    }

    private static void solveLinearEquation() {
        String strA = JOptionPane.showInputDialog(null, 
                "Enter coefficient a (for ax + b = 0):", 
                "Linear Equation Solver", 
                JOptionPane.INFORMATION_MESSAGE);
        
        double a = Double.parseDouble(strA);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, 
                    "Coefficient a cannot be zero.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String strB = JOptionPane.showInputDialog(null, 
                "Enter coefficient b (for ax + b = 0):", 
                "Linear Equation Solver", 
                JOptionPane.INFORMATION_MESSAGE);

        double b = Double.parseDouble(strB);
        double solution = -b / a;

        JOptionPane.showMessageDialog(null, 
                "The solution is: x = " + solution, 
                "Linear Equation Result", 
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static void solveLinearSystem() {
        String strA11 = JOptionPane.showInputDialog(null, 
                "Enter coefficient a11:", 
                "Linear System Solver", 
                JOptionPane.INFORMATION_MESSAGE);
        double a11 = Double.parseDouble(strA11);

        String strA12 = JOptionPane.showInputDialog(null, 
                "Enter coefficient a12:", 
                "Linear System Solver", 
                JOptionPane.INFORMATION_MESSAGE);
        double a12 = Double.parseDouble(strA12);

        String strB1 = JOptionPane.showInputDialog(null, 
                "Enter constant b1:", 
                "Linear System Solver", 
                JOptionPane.INFORMATION_MESSAGE);
        double b1 = Double.parseDouble(strB1);

        String strA21 = JOptionPane.showInputDialog(null, 
                "Enter coefficient a21:", 
                "Linear System Solver", 
                JOptionPane.INFORMATION_MESSAGE);
        double a21 = Double.parseDouble(strA21);

        String strA22 = JOptionPane.showInputDialog(null, 
                "Enter coefficient a22:", 
                "Linear System Solver", 
                JOptionPane.INFORMATION_MESSAGE);
        double a22 = Double.parseDouble(strA22);

        String strB2 = JOptionPane.showInputDialog(null, 
                "Enter constant b2:", 
                "Linear System Solver", 
                JOptionPane.INFORMATION_MESSAGE);
        double b2 = Double.parseDouble(strB2);

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, 
                        "The system has infinitely many solutions.", 
                        "Linear System Result", 
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, 
                        "The system has no solution.", 
                        "Linear System Result", 
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, 
                    "The solution is: x1 = " + x1 + ", x2 = " + x2, 
                    "Linear System Result", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void solveQuadraticEquation() {
        String strA = JOptionPane.showInputDialog(null, 
                "Enter coefficient a (for ax^2 + bx + c = 0):", 
                "Quadratic Equation Solver", 
                JOptionPane.INFORMATION_MESSAGE);
        
        double a = Double.parseDouble(strA);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, 
                    "Coefficient a cannot be zero.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String strB = JOptionPane.showInputDialog(null, 
                "Enter coefficient b (for ax^2 + bx + c = 0):", 
                "Quadratic Equation Solver", 
                JOptionPane.INFORMATION_MESSAGE);
        
        String strC = JOptionPane.showInputDialog(null, 
                "Enter coefficient c (for ax^2 + bx + c = 0):", 
                "Quadratic Equation Solver", 
                JOptionPane.INFORMATION_MESSAGE);
        
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            JOptionPane.showMessageDialog(null, 
                    "The roots are: x1 = " + root1 + ", x2 = " + root2, 
                    "Quadratic Equation Result", 
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            JOptionPane.showMessageDialog(null, 
                    "There is a double root: x = " + root, 
                    "Quadratic Equation Result", 
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
                    "The equation has no real roots.", 
                    "Quadratic Equation Result", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
