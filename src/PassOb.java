class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a  = i;
        b = j;
        c = k;
        volume = a * b * c;
    }
    boolean sameBlock(Block ob) {
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }
    boolean sameVolume(Block ob) {
        if(ob.volume == this.volume) return true;
        else return false;
    }
}

 class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("sizes ob1 = ob2 : " + ob1.sameBlock(ob2));
        System.out.println("sizes ob1 = ob3 : " + ob1.sameBlock(ob3));
        System.out.println("volume ob1 = ob3 : " + ob2.sameVolume(ob3));
    }
}
