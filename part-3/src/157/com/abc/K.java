package com.abc;
import java.io.File;
import java.io.IOException;
public class K{
        public static void main(String[] args){
                File f1 = new File("G:/abc");
               // f1.mkdir();
                File f2 = new File(f1,"hello.txt");
                try{
                        System.out.println(f2.createNewFile());
                }
                catch(IOException ex){
                        System.out.println(ex);
                }
                System.out.println("done");

        }
}

                


