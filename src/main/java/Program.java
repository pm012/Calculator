import Calculator.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import  Calculator.*;


public class Program {

    //main program enry point
    public static void main(String[] args)  {
        JCalculator calc = new JCalculator();

    }

    public static void  consoleCalculator() throws IOException{
        System.out.println("Welcome to integer calculator!");
        Calculator calc = new Calculator();
        String regex = "[0-9cC+-=*\\/=]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        Boolean flag = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (flag) {
            String input = br.readLine();
            char key;    //(char) System.in.read();

            if (Pattern.matches(regex, input)) {
                key = Character.valueOf(input.toCharArray()[0]);
                calc.press(key);
                System.out.println(calc);
            } else if (input.equals("exit")) break;

        }
    }
}
