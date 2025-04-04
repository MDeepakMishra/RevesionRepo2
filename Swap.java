//System.out.println("Swap usng two veriables");
public class Swap {
    public static void main(String[] args) {
        int a = 4 , b = 7 ;
        System.out.println("Before Swaping" );
        System.out.println("num" + a +" " + b);
        System.out.println("After Swaping Number");
        
        a = a + b ;
        b = a - b ;
        a = a - b; 
        System.out.println("num" + a +" " + b);
    }
}
