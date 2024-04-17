package com.abc;
import java.io.FileOutputStream;  import java.io.IOException;
import java.io.File;              import java.io.ObjectOutputStream;
public class Manager5{
        public static void main(String[] args) throws IOException{
                Employee e1 = new Employee("abc",22,55.9);
                File f1 = new File("G:/emp.txt");
                FileOutputStream fout = new FileOutputStream(f1);
                ObjectOutputStream out = new ObjectOutputStream(fout);
                e1.writeExternal(out);
                out.flush();
                out.close();
                out.close();
                System.out.println("done");
        }
}
