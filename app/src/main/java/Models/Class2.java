package Models;

/**
 * Created by mcfly on 2.08.2017.
 */

public class Class2 extends Class1 {

    public void call(){
        testMethodForClass1();
    }

    @Override
    protected void writeDown(String c) {
        super.writeDown(c);
    }
}
