class Sum {
    void addition(int a, int b) {
        System.out.println("Integer Sum = " + (a + b));
    }

    void addition(float a, float b) {
        System.out.println("Float Sum = " + (a + b));
    }

    void addition(double a, double b, double c) {
        System.out.println("Double Sum = " + (a + b));
    }
}

class SumMethodOvr3 {
    public static void main(String[] args) {
        Sum s1 = new Sum();
        s1.addition(5, 6);
        s1.addition(5.5f, 5.5f);
        s1.addition(5.5d, 6.5d, 7.5d);
    }
}