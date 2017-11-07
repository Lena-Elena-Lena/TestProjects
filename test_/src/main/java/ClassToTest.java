/**
 * Created by razgulyaeva on 02.10.2017.
 */
public class ClassToTest {
    private static int i=7;
    private int j=5;
    private static void testMethod() {
        new Test().testMethod1();
        Test.testMethod4();
        internalMethod();
        System.out.println("hello interface 1"+i);
        System.out.println("hello interface 1"+new ClassToTest().j+new ClassToTest().j);
    }
    private void testMethod2() {
        new Test().testMethod1();
        Test.testMethod4();
        internalMethod();
        System.out.println("hello interface 1"+new Test().h+Test.l+i);
        System.out.println("hello interface 1"+new ClassToTest().j+new ClassToTest().j+new ClassToTest().j);
    }
        private static void internalMethod() { System.out.println("hello interface 1"+ExtSmth.f); }

        public static class Test {
            public enum jj{k;}
            private int h=8;
            private static int l=9;
            private void testMethod1() {

                System.out.println("testMethod1");
            }
            private static void testMethod4() {
                System.out.println("testMethod4");
            }
            public void testMethod() {
                ClassToTest.testMethod();
                internalMethod();
                System.out.println("hello interface 1"+ClassToTest.i+i);
                System.out.println("hello interface 1"+new ClassToTest().j);
            }
        }
public class ee{
    final static int y=0;
    void rty(String h){
        System.out.println("hello"+h);

    }
}
    public static void main(String [] args){
        (new ClassToTest.Test()).testMethod();
        new ClassToTest().testMethod2();
        new ClassToTest(). new ee(){
            void rty(String h){
                System.out.println("hello"+y);

            }
        }.rty("oo");
    }
}
