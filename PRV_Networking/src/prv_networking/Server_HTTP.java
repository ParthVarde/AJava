/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prv_networking;
import java.net.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author parth
 */
public class Server_HTTP {
    public static void main(String[] args) throws Exception,FileNotFoundException {
        ServerSocket ss = new ServerSocket(3333);
        while(true)
        {
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String str = dis.readUTF();
            System.out.println(str);
            FileReader fr = new FileReader(str);
            BufferedReader br = new BufferedReader(fr);
            String str1 = "";
            String fr1 = "";
            while((str1=br.readLine())!=null)
            {
                fr1 = fr1 + str1;
            }
            fr.close();
            br.close();
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(fr1);
            dis.close();
            dos.close();
            s.close();
        }
    }
}
