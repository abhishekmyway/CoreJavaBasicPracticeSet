class Manager1{
        public static void main(String[] args){
                P p1 = new P();
                System.out.println(p1.i);

                P  p2 = new Q();
                System.out.println(p2.i);
                                
                R r1 = new R();
                System.out.println(r1.i);

                P p3 = r1;
                System.out.println(p3.i);
                System.out.println(((Q)p3).i);
        }
}

