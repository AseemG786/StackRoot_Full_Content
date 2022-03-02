package Day_1_git.d1_java;

public class test2 {
    public float sub(float a,float b) {
        float z=a-b;
        if(z<0){
            z=0;
            return z;
        }
        return z;        
    }
    public void display(){

    }
    public static void main(String[] args) {
        test2 t=new test2();
        
        System.out.println(t.sub(200, 30));

        
    }
    
}
