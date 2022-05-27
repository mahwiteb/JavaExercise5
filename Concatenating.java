public class Concatenating {
    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    class Concatenating {
        public static void main(String[] args) throws NumberFormatException, IOException {
            String input1, input2, con1, con2;
            BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your first word: ");
            input1 = BR.readLine();
            System.out.print("Enter your second word: ");
            input2 = BR.readLine();
            con1 = input1.concat(input2);
            con2 = input2.concat(input1);
            System.out.println(String.format("Composition of %s is alternating to " + con2.equals(con2), con1));
            System.out.println(String.format("Composition of %s is alternating to " + con1.equals(con2), con2));
        }
    }
}
