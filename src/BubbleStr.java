class BubbleStr {
    public static void main(String[] args) {
        String str4[] = {"a", "b", "c", "String", "sort", "for", "test"};
        int a, b;
        String t;
        int size;
        size = str4.length;
        System.out.println("Source array:");
        for (int i = 0; i < size; i++) {
            System.out.println(i + "[" + str4[i] + "]");
            // System.out.println("compare: " + str4[i+1].compareTo(str4[i]));
        }
        System.out.println();

        for (a = 0; a < size; a++) {
            for (b = (size - 1); b > a; b--) {
                System.out.println(b + " compare: " + str4[b - 1] + " > " + str4[b] + " = " + str4[b - 1].compareTo(str4[b]));
                if (str4[b - 1].compareTo(str4[b]) > 0) {
                    // System.out.println(b +"!");
                    t = str4[b - 1];
                    str4[b - 1] = str4[b];
                    str4[b] = t;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(i + "[" + str4[i] + "]");
        }
    }
}