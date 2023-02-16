class project {
    public static void main(String[] args) {
        int n = 124, s = 0, d;
        for (; n != 0; n /= 10) {
            d = n % 10;
            s += d;
        }
        System.out.println("sum of digits : " + s);
    }
}