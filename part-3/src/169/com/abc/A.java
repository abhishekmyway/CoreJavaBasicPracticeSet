package com.abc;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A{
        public static void main(String[] args) throws IOException{
                FileWriter out = new FileWriter("G:/test.txt");
                BufferedWriter bout = new BufferedWriter(out);

                bout.write("hello to all");
                bout.newLine();
                bout.write("hello to all");
                bout.newLine();
                bout.write("hello to all");
                
                bout.flush();
                bout.close();
                out.close();
                System.out.println("done");
        }
}
