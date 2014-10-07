public class Test {
    // instance variables - replace the example below with your own
    private int x = 3;

    public int sampleMethod(int y){
       return x + y;
    }
    
    public int sampleMethod(int y, int z){
        return x + y + z;
    }
    
    public int sampleMethod(){
        return x + x;
    }
}

class SonOfTest extends Test {
    public int sampleMethod(int y, int z, int r){
        return 0;
    }
    
    @Override
    public int sampleMethod(){
        return super.sampleMethod() + super.sampleMethod();
    }
}