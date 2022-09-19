import java.util.Scanner;

public class ASCIItabel { public static void main(String[]args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Indtaste et tegn");
    while (true) {
    String s = sc.next();
    char c = s.charAt(0);
    System.out.println(c);

    if (s.equals("exit")) {break;}

    if(c >= 65 && c <= 90) {
        System.out.println("Tegnet er et stort bogstav");   }
                 else if (c >= 97 && c <=122 ){
            System.out.println("Tegnet er et lille bogstav");  }
                 else if(c >= 48 && c <= 57){
            System.out.println("Tegnet er et tal / for 0-9"); }
                 else if(c == 33 || c ==35 || c == 43 || c == 47){
            System.out.println("Tegnet af et af de 4 specialtegn");  }
                    else {
                System.out.println("Tegnet er ikke kendt af dette programet");
            }
    }
}
}
                  //asdasdasd