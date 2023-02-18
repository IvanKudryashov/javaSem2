package sem2;

import java.util.logging.*;
import java.io.IOException;
import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) throws IOException{
        Logger logger = Logger.getLogger(dz2.class.getName());
        FileHandler fh = new FileHandler("log2.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        Scanner scanner = new Scanner(System.in);
        System.out.printf("введите операцию ");
        char m = scanner.next().charAt(0);
        System.out.printf("int a = ");
        int a = scanner.nextInt();
        System.out.printf("int b = ");
        int b = scanner.nextInt();
        switch(m) {
            case '+': 
            System.out.println(a + b);
            logger.info("сложение: " + a + " + " + b + " = "+ (a+b));
            break;
            case '-': 
            System.out.println(a - b);
            logger.info("вычитание: " + a + " - " + b + " = "+ (a-b));
            break;
            case '*': 
            System.out.println(a * b);
            logger.info("умножение: " + a + " * " + b + " = "+ (a*b));
            break;
            case '/': 
            System.out.println(a / b);
            logger.info("деление: " + a + " / " + b + " = "+ (a/b));
            break;
        }
        scanner.close();
    }
}
