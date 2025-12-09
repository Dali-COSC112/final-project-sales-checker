    import java.util.Scanner;
    
    public class SalesChecker {
        public static void main(String[] args) {
    
            Scanner scanner = new Scanner(System.in);
    
    
            System.out.print("How many sales do you want to enter? ");
           int count = scanner.nextInt(9);
   
           double[] sales = new double[count];
   
   
           for (int i = 0; i < sales.length; i++) {
               System.out.print("Enter sale #" + (i + 1) + ": ");
               sales[i] = scanner.nextDouble();
           }
   
   
           double total = 0;
           double highest = sales[0];
   
   
           int index = 0;
           while (index < sales.length) {
   
               total += sales[index];
   
              if (sales[index] > highest) {
                   highest = sales[index];
               }
   
               index++;
           }
   
   
           System.out.println("\n--- SALES REPORT ---");
   
   
           for (int i = 0; i < sales.length; i++) {
               System.out.println("Sale #" + (i + 1) + ": $" + sales[i]);
           }
   
           System.out.println("Total sales: $" + total);
           System.out.println("Highest sale: $" + highest);
   
   
       }
   }   
53   
