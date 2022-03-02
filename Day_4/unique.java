package Day_4;

// import java.lang.reflect.Array;
import java.util.Arrays;

public class unique {
  public boolean getUniqueArrayElement(int numberArray[]){
		Arrays.sort(numberArray);
		for(int i=0;i<numberArray.length-1;i++){
			if(numberArray[i]==numberArray[i+1]) {
				return false;
			}
		}
        boolean result = true;
        return result;
    }
    public static void main(String[] args) {
        int [] arr={101,105,106,107,108,109};
        // Array.sort(arr);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            // system.println()
            System.out.println(arr[i]);
        }
    }
  //   public static void main(String[] args) {
		
	// 	String[] ar = {"java", "spirng", "hibernate", "fsd"};
		
	// 	System.out.println(ar[0]);
		
	// 	for(String k : ar)
	// 	{
	// 		System.out.println(k);
	// 	}
	// }

    
}
