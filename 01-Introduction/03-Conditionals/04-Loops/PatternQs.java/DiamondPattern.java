public class DiamondPattern {
    public static void main(String args[]) {

       //upper part
       for(int i=1; i<=5; i++) {
           //spaces
           for(int j=1; j<=5-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }


       //lower part
       for(int i=5; i>=1; i--) {
           //spaces
           for(int j=1; j<=5-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }   
}
