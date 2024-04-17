class Manager7{
        static{
                System.out.println("Manager7-SIB");
        }
        public static void main(String[] args){
                System.out.println("Manager7-main-b");
                Manager5.main(args);
                System.out.println("-------");
                Manager4.main(args);
                System.out.println("Manager7-main-e");
        }
}
