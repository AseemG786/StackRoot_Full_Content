package Day_4;
public class pair_sum {

    
    public static void main(String[] args) {
        // int a[]={6, 1, 9, 4, 7, 11, 2, 2, 12, 12};
        // int b[]=sumOfArrayPair(a);           //obtain the array  
        // for(int i=0;i+1<b.length;i++){
        //     // a[index++]=numberArray[i]+numberArray[i+1];
        //     System.out.println(b[i]);
        // }
        int[] arr1 = {1,3,3,4,5};

        int[] arr2 = new int[10];
       
            for(int i = 0; i < 3; i++)
       
            {
       
                arr2[i] = (arr1[arr1.length-1]+1);
       
                arr2[i+1] = (arr1[arr1.length]+2);
       
            }
       
          System.out.println(arr2);

    }
    public static int[] sumOfArrayPair(int numberArray[]){
        int a[]={};
        int index=0;
        // if(numberArray.length%2==0) {  // for even condition
            for(int i=0;i+1<numberArray.length;i=i+2){
                a[index++]=numberArray[i]+numberArray[i+1];
            }    
        // }
    
        // return new int[0];
        return a;
    }
    
}
