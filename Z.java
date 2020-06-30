import java.util.*;
          
          public class Main {
          
              public static void main(String[] args){
             	      //   System.out.println("*****");
             	      //   System.out.println("   *");
             	      //   System.out.println("  *");
             	      //   System.out.println(" *");
             	      //   System.out.print("*****");
             	      int n=5;
             	      for(int i=0;i<n;i++){
             	          if(i==0||i==n-1)
             	              for(int j=0;j<n-1;j++)
             	                System.out.print("*");
             	          else
             	              for(int j=0;j<n-1-i;j++)
             	                System.out.print(" ");
             	          System.out.println("*");
             	      }
         
              }
         }0 days ago
1 days ago
0 days ago
1 days ago
2 days ago
