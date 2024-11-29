import javax.swing.JOptionPane;

public class DaysInMonth {
    public static void main(String[] args) {
        while (true) {
            String strMonth = JOptionPane.showInputDialog("Enter the month (full name, abbreviation, or number):");
            String strYear = JOptionPane.showInputDialog("Enter the year (non-negative number):");

            if (isValidYear(strYear)) {
                int year = Integer.parseInt(strYear);
                int monthDays = getDaysInMonth(strMonth, year);

                if (monthDays != -1) {
                    JOptionPane.showMessageDialog(null, "Number of days: " + monthDays);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid month. Please try again.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid year. Please try again.");
            }
        }
    }

    private static int getDaysInMonth(String month, int year) {
        switch (month) {
            case "January":
            case "Jan":
            case "Jan.":
            case "1":
                return 31;
            case "February":
            case "Feb":
            case "Feb.":
            case "2":
                return isLeapYear(year) ? 29 : 28;
            case "March":
            case "Mar":
            case "3":
                return 31;
            case "April":
            case "Apr":
            case "4":
                return 30;
            case "May":
            case "5":
                return 31;
            case "June":
            case "Jun":
            case "6":
                return 30;
            case "July":
            case "Jul":
            case "7":
                return 31;
            case "August":
            case "Aug":
            case "8":
                return 31;
            case "September":
            case "Sep":
            case "9":
                return 30;
            case "October":
            case "Oct":
            case "10":
                return 31;
            case "November":
            case "Nov":
            case "11":
                return 30;
            case "December":
            case "Dec":
            case "12":
                return 31;
            default:
                return -1;
        }
    }

    private static boolean isValidYear(String year) {
    try {
        int y = Integer.parseInt(year);
        return y > 0; 
    } catch (NumberFormatException e) {
        return false; 
    }
}


    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
