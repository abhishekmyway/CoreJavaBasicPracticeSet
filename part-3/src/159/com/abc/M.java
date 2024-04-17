package com.abc;
import java.io.File;
import java.io.IOException;
public class M{
        public static void main(String[] args) throws IOException{
                File f1 = new File("G:/lab","abc.txt");
                File f2 = new File("G:/lab","test");
                System.out.println(f1.createNewFile());
                System.out.println(f2.mkdir());
               
        }
}

                


