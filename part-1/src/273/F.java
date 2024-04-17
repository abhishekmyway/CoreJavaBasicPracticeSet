class F{
        C c1 = null;
        public static void main(String[] args){
                F f1 = new F();
                f1.c1 = new C();
                System.out.println(f1.c1);
                System.out.println(f1.c1.i);
        }
}

