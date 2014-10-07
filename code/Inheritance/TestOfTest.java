public class TestOfTest {
    public static void main(String[] args){
        SonOfTest t = (SonOfTest)new Test();
        System.out.println("result = " + t.sampleMethod());
    }
}