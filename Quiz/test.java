package Quiz;
public class test {
    public static void main(String s[]) {
        int count =0;
        int x=3;
        while(count++<3){
            int y=(1+2*count)%3;
            switch(y){
                case 0:
                    x-=1;
                break;
                case 1:
                    x+=5;
                default:
            }
        }
        System.out.println(x);
        // byte x =5,y=10;
        // short z=x+y;
        // System.out.println(z);
        // float f1=5.3f;
        // if(f1==5.3){
        //     System.out.println("if");
        // }
        // else{
        //     System.out.println("else");
        // }
        // int ctr =12;
        // for(int j=10,k=14;j<=k;j++,k--,ctr--){
        //     System.out.println(j+":"+k+":"+ctr);
        // }

    //     if(1<2){
    //         System.out.println("1 is less then ");

    //     }
    //     else
    //     System.out.println("2 in less the 1");
    //     System.out.println("Hello from if");
    // }
    
}
}