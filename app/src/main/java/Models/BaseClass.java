package Models;

/**
 * Created by mcfly on 2.08.2017.
 */

public abstract class BaseClass {

    private String className = "Base Class";

    public abstract void deneme();
    protected void x(){

    }

    protected void writeDown(String c) {
        className = className + " " + c;
    }
}
