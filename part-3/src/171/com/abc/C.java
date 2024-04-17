package com.abc;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class C{
        public static void main(String[] args){
                FileWriter out = null;
                BufferedWriter bout = null;
                try{
                       out = new FileWriter("G:/test.txt");
                       bout = new BufferedWriter(out);

                       bout.write("hello to all");
                       bout.newLine();
                       bout.write("hello to all");
                       bout.newLine();
                       bout.write("hello to all");
                }
                catch (IOException ex){
                        ex.printStackTrace();
                }
                finally{
                        try{
                                if(bout != null){
                                        bout.flush();
                                        bout.close();
                                        bout = null;
                                }

                        }
                        catch(IOException ex){
                                ex.printStackTrace();
                        }
                        try{
                                if(out != null){
                                       //out.flush();
                                        out.close();
                                        out = null;
                                }

                        }
                        catch(IOException ex){
                                ex.printStackTrace();
                        }

                }
        }
}
