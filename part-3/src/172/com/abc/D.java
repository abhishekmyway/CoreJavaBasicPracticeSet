package com.abc;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class D{
        public static void main(String[] args) throws IOException{
                File f1 = new File("G:/test.txt");
                FileReader in = null;
                BufferedReader bin = null;
                try{
                       in = new FileReader(f1);
                       bin = new BufferedReader(in);
                       String s1 = bin.readLine();
                       while(s1 != null){
                                System.out.println(s1);
                                s1 = bin.readLine();
                       }
                }
                catch (IOException ex){
                        ex.printStackTrace();
                }
                finally{
                        try{
                                if(bin != null){
                                        bin.close();
                                        bin = null;
                                }

                        }
                        catch(IOException ex){
                                ex.printStackTrace();
                        }
                        try{
                                if(in != null){
                                        in.close();
                                        in = null;
                                }

                        }
                        catch(IOException ex){
                                ex.printStackTrace();
                        }

                }
        }
}
