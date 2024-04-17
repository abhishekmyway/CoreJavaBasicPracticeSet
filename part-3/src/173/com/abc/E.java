package com.abc;
import java.io.BufferedInputStream;   import java.io.BufferedOutputStream;
import java.io.File;                   import java.io.FileInputStream;
import java.io.FileOutputStream;      import java.io.IOException;

public class E{
        public static void main(String[] args){
                File f1 = new File("C:\\Documents and Settings\\All Users\\Documents\\My Pictures\\Sample Pictures\\Sunset.jpg");
                File f2 = new File("G:/test.jpg");

                FileInputStream fin = null;
                BufferedInputStream bin = null;
                FileOutputStream fout = null;
                BufferedOutputStream bout = null;

                try{
                       fin = new FileInputStream(f1);
                       bin = new BufferedInputStream(fin);
                       byte[] b = new byte[(int) f1.length()];
                       fin.read(b);
                       fout = new FileOutputStream(f2);
                       bout = new BufferedOutputStream(fout);
                       bout.write(b);
                       System.out.println("done");
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
                                if(fout != null){
                                       //out.flush();
                                        fout.close();
                                        fout = null;
                                }

                        }
                        catch(IOException ex){
                                ex.printStackTrace();
                        }
                        try{
                                if(bin != null){
                                       //out.flush();
                                        bin.close();
                                        bin = null;
                                }

                        }
                        catch(IOException ex){
                                ex.printStackTrace();
                        }
                        try{
                                if(fin != null){
                                       //out.flush();
                                        fin.close();
                                        fin = null;
                                }
                        }
                        catch(IOException ex){
                                ex.printStackTrace();
                        }
                }
        }
}
