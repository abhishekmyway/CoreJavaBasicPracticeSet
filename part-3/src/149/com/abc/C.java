package com.abc;
import java.io.File;
import java.io.IOException;
public class C{
        public static void main(String[] args){
                File f1 = new File("resume.doc");
                try{
                        System.out.println(f1.createNewFile());
                }
                catch(IOException ex){
                      ex.printStackTrace();
                }

                System.out.println("done");
        }
}

                
