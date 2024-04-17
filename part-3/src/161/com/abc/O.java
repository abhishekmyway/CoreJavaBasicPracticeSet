package com.abc;
import java.io.File;
public class O{
        public static void main(String[] args){
                File f1 = new File("G:/xyz");
                File f2 = new File("G:/xyz/hello.txt");

                System.out.println(f1.isDirectory());
                System.out.println(f1.isFile());

                System.out.println(f2.isDirectory());
                System.out.println(f2.isFile());
        }
}
