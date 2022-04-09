public class RotateArray{

    // public static void rotatebyOne(int arr[]){
        
    //     int temp = arr[0];
    //     for(int i=1;i<arr.length;i++){
    //         arr[i-1] = arr[i];
    
    //     }
    //     arr[arr.length-1] = temp;


    // }   
    
    // public static void rotatebyKey(int arr[],int d){
    //     d = d % arr.length;
    //     if(d < 0){
    //         d = d + arr.length;
    //     }
    //     for(int i=1;i<=d;i++){
    //         rotatebyOne(arr);
    //     }
    // }

      static void reverseArray(int arr[],int start,int end){
        
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
        static void rotatebyKey(int arr[],int k){
       
            k = k % arr.length;// suppose k is greter than n then it becomes k ==n then 0,then 1,2,3,..
            if(k < 0){
                //if our k is less than 0 then -3+5 =2;Rotate array by two time then yot get desier
                //output
                k = k+ arr.length;
                
            }
    
            reverseArray(arr, 0, k-1);
            reverseArray(arr, k, arr.length-1);
            reverseArray(arr,0,arr.length-1);
    
        
    
  


    }
    public static void main(String args[]) {
        
        int arr[] ={1, 2, 3, 4, 5,6,7,8};
        // rotatebyKey(arr,3);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        rotatebyKey(arr,5);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");



    }
}

/*abstract
[Running] cd "/home/kali/TapAcademy/TapAcademy-1/" && javac RotateArray.java && java RotateArray
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
6 7 8 1 2 3 4 5 
*/