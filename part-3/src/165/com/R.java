package com.abc;
import java.io.FileWriter;
import java.io.IOException;

public class R{
        public static void main(String[] args) throws IOException{
                FileWriter out = new FileWriter("G:/test1.txt");

                out.write("hello to all");
                out.write("\nhello to all");
                out.flush();
                out.close();
                System.out.println("done");
        }
}
