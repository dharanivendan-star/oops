class  A{
        int a;
        String name, s;

void set(int a) {
    this.a = a;
    System.out.println("The value of a is " + a);
}

void set(int a, String name) {
    this.a = a;
    this.name = name;
    System.out.println("the value of a is " + a + " name is " + name);
}
    }

    class poly{
        public static void main(String[] args) {
            A dva = new A();
            dva.set(5);
            dva.set(9,"vel");

        }
    }