import java.util.Scanner;

public class Main {

    static void hi() {
        System.out.println("Hi, it's me - Java.");
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Java says Hello!");
        hi();

        System.out.println("What will you say? Say OK when it's ok. Say MEH, when it could be better.");
        String phrase = sc.nextLine();

        if (phrase == "OK" || phrase == "ok" || phrase == "Ok") {
            System.out.println("Nice to hear that!");
        } else if (phrase == "MEH" || phrase == "Meh") {
            System.out.println("SO sorry!");
        } else {
            System.out.println("Sorry, I do not understand.");
        }
    }

}
