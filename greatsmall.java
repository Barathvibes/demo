public class greatsmall{

    public static void main(String[] args) {
      
     int n1 = 50, n2 = 10;

                    // USING TERNARY OPERATOR //


    // if (n1 == n2)
    //   System.out.println ("\n Both are Equal \n");
    // else
    //   {
    //     int temp = (n1 > n2 ? n1 : n2);
    //     System.out.println ("\n" + temp + " is largest \n");
    //   }


                    //  USING ELSE IF //
    
    // if (n1 == n2)
    // {
    //     System.out.println("Both are equal..");
    // }
    // else if (n1 > n2)
    // {
    //     System.out.println(n1 + " is greater than "+n2 );
    // }
    // else{
    //     System.out.println(n2 + " is less than "+n1);
    // }


                      // USING FORMULA //
    
    // if (n1 == n2)
    // {
    //     System.out.println("Both are equal..");
    // }

    // else{
    //     System.out.println(Math.max(n1,n2) + " is greater..");
    // }


                // B TECH //

        System.out.println ("\n" + (n1 > n2 ? n1 : n2) + " is largest \n");
  }
}
   