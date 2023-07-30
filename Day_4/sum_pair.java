package Day_4;
public class sum_pair {
    public static void main(String[] args) {

        int[] arr1 = {1,3,3,4,5};
       
        int[] arr2 = new int[10];
       
            for(int i = 0; i < 3; i++)
       
            {
       
                arr2[i] = (arr1[arr1.length-1]+1);
       
                arr2[i+1] = (arr1[arr1.length]+2);
       
            }
       
          System.out.println(arr2);
       
       }
    
}
