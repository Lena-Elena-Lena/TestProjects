/**
 * Created by razgulyaeva on 02.10.2017.
 */
public class fff implements ExtSmth, ISmth {
    @Override
    public void rr() {
        System.out.println("hello interface 1"+ISmth.f);

    }
    public static void main(String [] args){
        (new fff()).rr();
    }
}
