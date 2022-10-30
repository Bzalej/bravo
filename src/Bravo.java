import java.util.Scanner;

public class Bravo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String name=sc.nextLine();
            for (int i = 0; i < 5; i = i + 1) {
                System.out.println("Cześć " + name);
        }
            int count=0;
                    while (count<5){
                        count++;
                        System.out.println("Cześć " + name + " - wypisane z innej pętli");
                    }


    }
}
