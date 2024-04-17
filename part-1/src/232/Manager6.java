class Manager6{
        static{
               System.out.println("Manager6-SIB");
        }
        public static void main(String[] args){
                System.out.println("Manager6-main-b");
                Manager4.main(args);
                System.out.println("Manager6-main-e");
        }
}
