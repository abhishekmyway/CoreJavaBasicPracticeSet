class Manager4{
        static void method(C c1){
                c1.test1();
        }
        public static void main(String[] args){
                C obj1 = new C();
                D obj2 = new D();
                method(obj1);
                method(obj2);
        }
}

