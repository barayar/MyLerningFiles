class OverloadT {
void f (int x) {
    System.out.println("In f (int): " + x);
}
void f(double x) {
    System.out.println("In f(double): " + x);
}
}

public class TypeConv {
    public static void main(String[] args) {
        OverloadT ob = new OverloadT();
        int i =10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i);
        ob.f(d);
        ob.f(b);
        ob.f(s);
        ob.f(f);
    }
}
