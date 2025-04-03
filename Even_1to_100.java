public class Even_1to_100 {
  public static void main(String[] args) {
    System.out.println("PRINT EVEN NUM FROM 1 TO 100");
    int n = 100;
    for( int i = 1 ; i < n ; i++){
        if( i % 2 == 0){
            System.out.print( i + " ");
        }
    }
  }

}
