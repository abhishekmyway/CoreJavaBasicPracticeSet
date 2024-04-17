package com.abc;
import java.io.File;
import java.io.IOException;
public class D{
        public static void main(String[] args){
                File f1 = new File("G:/test.html");
                try{
                        System.out.println(f1.createNewFile());
                }
                catch(IOException ex){
                      ex.printStackTrace();
                }

                System.out.println("done");
        }
}

                
