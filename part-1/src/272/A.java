class A{
        void test1(){
                System.out.println("test1:"+this);
                test2();
                this.test2();
        }
        void test2(){
                System.out.println("test2:"+this);
                test3();
                this.test3();
        }
        void test3(){
                System.out.println("test3:"+this);
        }
        public static void main(String[] args){
                A a1 = new A();
                System.out.println("main:"+a1);
                a1.test1();
        }
}

