import java.util.*;

public class ZpatternNum{
    public static void main(String args[]){
       int n=4;
        // int num =1;
        // //Top
        // for(int i=1;i<=n;i++){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // //midal
        // for(int i=1;i<n;i++){
        //     for(int j=1;j<n-i;j++){
        //         System.out.print("  ");
        //     }
        //     System.out.print(n-num+" ");
        //     System.out.println();
        //     num++;
        // }
/*
4444
3444
2344
1234
*/
        // for(int i=n;i>=1;i--){
        //     for(int j=i;j<=n;j++){
        //         System.out.print(j);
            
        //     }
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print(n);
        //     }

            
        //     System.out.println();
        // }
        



        // int k=n;
        // //Bottom
        // for(int i=1;i<=k;i++){
        //     System.out.print(i+" ");
        // }

  

/*abstract


1 2 3 4 5 6 
        5 
      4 
    3 
  2 
1 
1 2 3 4 5 6
*/

/*
   P   
   R   
   O   
PROGRAM
   R   
   A   
   M   


   */

// String str = "PROGRAM";



//   for(int i=0;i<str.length();i++){
//     for(int j=0;j<str.length();j++){
    
//     if(i == str.length()/2){
//       System.out.print(str);
//       break;
//     } 
//     else {
//       if(j == str.length()/2)
//       System.out.print(str.charAt(i));
//     else
//       System.out.print(" ");
//       }

//     }  
//     System.out.println();
//   }

for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
      if(i == n/2) {
      System.out.print("*");
      

      }else{
        if(j == n/2)
          System.out.print("*");
          else
          System.out.print(" ");

       
        
        
      }
      
    }
    System.out.println();
    

  }
      

}}
