package prv;

import java.net.*;
import java.io.*;
import java.util.*;

public class Server_reverse {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(3335);
        while(true)
        {
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String str = dis.readUTF();
            StringBuffer sb = new StringBuffer(str);
            String rev = sb.reverse().toString();
            String rt = "";
            char ch ;
            for(int i=0;i<rev.length();i++)
            {
                ch = rev.charAt(i);
                if(Character.isUpperCase(ch))
                {
                    rt = rt + Character.toLowerCase(ch);
                }
                else if(Character.isLowerCase(ch))
                {
                    rt = rt + Character.toUpperCase(ch);
                }
                else
                {
                    rt = rt + ch;
                }
            }


            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(rt);


            dis.close();
            dos.close();
            s.close();
        }
    }
}
