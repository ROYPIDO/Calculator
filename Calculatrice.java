package ssg;

import java.util.Scanner;

public class Calculatrice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen islem yapmak istediginiz operatoru giriniz");
        String operator = scan.next();
        switch (operator) {
            case "+":

                System.out.println("sayilarin toplami : " + (scan.nextDouble() + scan.nextDouble()));
                break;
            case "*":
                System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                System.out.println("sayilarin carpimi : " + (scan.nextDouble() * scan.nextDouble()));
                break;
            case "-":
                System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                System.out.println("sayilarin farki : " + (scan.nextDouble() - scan.nextDouble()));
                break;
            case "/":
                System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                System.out.println("sayilarin bolumu : " + (scan.nextDouble() / scan.nextDouble()));
                break;
            case "%":
                System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                System.out.println("sayilarin bolumunden kalan : " + (scan.nextDouble() % scan.nextDouble()));
                break;
            default:
                System.out.println("lutfen gecerli bir operator seciniz");


        }
    }
}
