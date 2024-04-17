class L{
        public static void main(String[] args){
                double d = 20.9;
                
                int i = (short)(int)(byte)(long)d;
                System.out.println(i);

                short j = (byte)(long)d;
                System.out.println(j);

                short k = (short)(byte)(long)d;
                System.out.println(k);


                System.out.println("done");
        }
}
                

