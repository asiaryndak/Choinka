import java.util.Scanner;

/**
 * Created by asiar on 01.12.2016.
 */
public class ChristmasTree {

    public static void main(String [] args){
    Print print= new Print();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokość choinki:\n Uwagi: liczba musi być liczbą całkowitą i mieścić się w zakresie 0 - 10000. \n");
        int height;
        try {
            height = scanner.nextInt();
            if (height >= 0 && height < 10000) {
                print.printTree(height);
            } else {
                System.out.println("Podałeś liczbę spoza zakresu 0 - 10000");
            }
        }
        catch(Exception e){
            System.out.println("Wprowadziłeś liczbę niecałkowitą");
        }
    }
}
