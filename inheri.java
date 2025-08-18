class B {
    public void get() {
        System.out.println("this is super class");
    }
}

    class C extends B {
    @Override
        public void get() {
            System.out.println("this is sub class");
        }
    }

    public class Main5 {

        public static void main(String[] args) {

            C dva = new C();
            dva.get();
        }
    }



