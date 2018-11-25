kfjlkjdlkj
import java.awt.Font;
import javax.swing.*;

public class FinalProject6 {

    public static void showOutput(String output) {
        JTextArea jt = new JTextArea(output);
        jt.setFont(new Font("Monotype Corsiva", Font.ITALIC, 72));
        JOptionPane.showMessageDialog(null, jt);
    }

    public static float getAverage(int x[]) {
        float total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }

        return total / x.length;

    }

    public static int getHighest(int x[]) {
        int hi = X[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > hi) {
                hi = x[i];
                return hi;

            }
        }

    }
    
    public static String putArray(int x[]){
        String result="";
        for (int i=0;i<x.length;i++)
            result +=x[i]+" ";
        return result;
    }
    
    public static int[] getData(String input){
        String data[]=input.trim().split("\\s+");
        int x[]=new int[data.length];

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
