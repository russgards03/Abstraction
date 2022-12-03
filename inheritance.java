import javax.swing.*;

public class ValuesResult {
    public static int computeValue(String value1, String value2){
        int val1 = Integer.parseInt(value1);
        int val2 = Integer.parseInt(value2);
        int ans = val1 * val2;
        return ans;
    }
    public static void displayMessage(String message){
        JOptionPane.showMessageDialog( null, message, "The answer is!: " , JOptionPane.INFORMATION_MESSAGE );
    }
}
