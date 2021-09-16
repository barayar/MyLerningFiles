class MyOverClass{
    int x;

    MyOverClass() {
        System.out.println("In MyOverClass().");
        x = 0;
    }

    MyOverClass(int i) {
        System.out.println("In MyOverClass(int).");
        x = i;
    }

    MyOverClass(double d) {
        System.out.println("In MyOverClass(double).");
        x = (int) d;
    }

    MyOverClass(int i, int j) {
        System.out.println("In MyOverClass(int,int).");
        x = i * j;
    }
}

public class OverloadConsDemo {
    public static void main(String[] args) {
        MyOverClass t1 = new MyOverClass();
        MyOverClass t2 = new MyOverClass(88);
        MyOverClass t3 = new MyOverClass(17.23);
        MyOverClass t4 = new MyOverClass(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);

    }
}
