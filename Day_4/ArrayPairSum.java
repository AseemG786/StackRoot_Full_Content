
package Day_4;

/**
 * pairSum_main
 */
public class ArrayPairSum {

    public static void main(String[] aa) {

        //Declare and initialize integer array in the variable numberArray
        // int[] numberArray=null;
		int numberArray[]={12,13,14,15,16};
        ArrayPairSum arrayPairSum = new ArrayPairSum();
        int sumArray[] = arrayPairSum.sumOfArrayPair(numberArray);
		for(int x:sumArray){
			System.out.println(x);
		}
        //write forEach loop to iterate through the 'sumArray' to print the output
    }

    public int[] sumOfArrayPair(int numberArray[]){
		int[] outputArray=new int[(numberArray.length)/2];
		int index=0;
		// if(numberArray.length%2==0) {  // for even condition
			for(int i=0;i+1<numberArray.length;i=i+2){
				outputArray[index++]=numberArray[i]+numberArray[i+1];
			}
			// if((numberArray.length)%2!=0){
			// 	outputArray[index]=numberArray[(numberArray.length)-1];
			// }


		// }

        // return new int[0];
		return outputArray;
    }
}
