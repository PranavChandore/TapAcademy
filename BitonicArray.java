/*Given a bitonic sequence of n distinct elements, and an integer x,
 the task is to write a program to find given element 
 x in the bitonic sequence in O(log n) time. 


Bitonic - first strictly increasing then after strictly 
decreasing its value at a point after
arr =[5,6,7,8,9,10,3,2,1]
O(LogN) - we required Bianry search

Below is the step by step algorithm on how to do this.

    Find the bitonic point in the given array, i.e the maximum element in the given bitonic array. This can be done in log(n) time by modifying the binary search algorithm. You can refer to this post on how to do this.
    If the element to be searched is equal to the element at the bitonic point then print the index of the bitonic point.
    If the element to be searched is greater than the element at a bitonic point then the element does not exist in the array.
    If the element to be searched is less than the element at a bitonic point then search for the element in both halves of the array using binary search.


*/











public class BitonicArray {
//Asc ing is normal binary search 
    static int acendingSide(int arr[],int range,int key){
        int s =0;
        int e = range;
        int mid ;
        
        while(s<=e){
            mid = (s+e)/2;

            if(key==arr[mid]){
                return mid;
            }

            if(key > arr[mid]){
                s=mid+1;
            }else{
                 e = mid -1;
            }

        }
        return -1;
    }

    static int descside(int arr[],int range,int key){
        int s =range;
        int e = arr.length-1;
        int mid ;
        
        while(s<=e){
            mid = (s+e)/2;

            if(key==arr[mid]){
                return mid;
            }

            if(key > arr[mid]){
                e= mid -1;
            }else{
                 s= mid +1;
            }

        }
        return -1;
    }
    

    static int bitonicPoint(int arr[]){
        int s=0;
        int e=arr.length-1;
        int mid;

        
        while(s<=e){
            mid = (s+e)/2;
            if(arr[mid] > arr[mid-1]  && arr[mid] > arr[mid+1]){
                return mid;
            }
            //Now below means you in left side
            else if(arr[mid] > arr[mid-1]  && arr[mid] < arr[mid+1]){
                 s = mid;
            }else
            //NOw your in right side
            {
                e =mid;
            }

        }

        return -1;
    }

    static int SearchBitonic(int arr[],int bINdex,int key){
        
        if(key == arr[bINdex]){
            return bINdex;
        }

        if(key > arr[bINdex]){
            return -1;
        }

        int res1 = acendingSide(arr, bINdex-1, key);

        if(res1 != -1){
            return res1;
        }

        int res2 = descside(arr, bINdex+1, key);

        if(res2 != -1){
            return res2;
        }

        return -1;

    }

    


    public static void main(String args[]){
        int arr[] = { 5,6,7,8,9,10,3,2,1};
        
        int key =2;
        int bINdex = bitonicPoint(arr);
        System.out.println(SearchBitonic(arr,bINdex,key));

    }
    
}
