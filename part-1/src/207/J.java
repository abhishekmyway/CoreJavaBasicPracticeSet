class J{
        public static void main(String[] args){
                byte a = 10;
                short b = 20;
                int c = 10;
                long d = 20;
                float f = 20;
                double g = 20.09;

                a = b;
                b = a;
                d = c;
                c = d;
                g = f;
                f = g;
                System.out.println("done-207");
        }
}

