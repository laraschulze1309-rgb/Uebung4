package h2;

public class H2_main {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = true;
        boolean a = false; 
        boolean b = false;
        boolean c = false;
        int input = 1;

        switch (input) {
            case 0:
               x = false;
               y = false;
               c = true;
                break;
            case 1:
               x = false;
                y = true;
                c = false;
                break;
            case 11:
                x = true;      
                y = true;
                c = false;
                break;
            case 10:
                x = true;
                y = false;
                c = true;
                break;
        }

        if (x == true && y == true) {
            a = true;
        }
        if (x == true || x != y) {
            b = true;
        }

        System.out.println("input:" + input);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("a: " + a);
        System.out.println("b: " + b);  
        System.out.println("c: " + c);
    }
}
