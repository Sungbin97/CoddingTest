// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        int totalPrice = sc.nextInt();
        int totalAmount = sc.nextInt();
        System.out.println("total: " + totalPrice);
        System.out.println("amount: " + totalAmount);
        while (sc.hasNext()) {
            String priceAmt = sc.nextLine();
            String[] arr = priceAmt.split(" ");
           for(String str:arr) list.add(str);
           Optional<Integer> intList = list.stream().filter(i-> !i.equals(""))
                   .map(Integer::parseInt).reduce((a,b)-> a*b);


        }
        sc.close();

    }
}