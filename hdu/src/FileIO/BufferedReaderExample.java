package FileIO;

import java.io.*;

/**
 * Created by xinrui on 11/01/17.
 */
public class BufferedReaderExample {
    public static void main(String args[]){
        System.out.println("Working Directory = " +
                System.getProperty("user.dir"));
        String currentDir = System.getProperty("user.dir");
        try{
            InputStream fin=new FileInputStream(currentDir+"/src/resources/input.txt");
            InputStreamReader reader = new InputStreamReader(fin);
            BufferedReader r = new BufferedReader(reader);
            String line;
            while((line=r.readLine())!=null){
                System.out.println(line);
            }
            /*BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            */
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
