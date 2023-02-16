class project {
    public static void main(String[] args) {
        int n = 123, s = 0;
        for (; n != 0; n /= 10)
            s += n % 10;
        System.out.println("sum of digits : " + s);
    }
}