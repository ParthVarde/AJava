/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prv_networking;

import java.net.*;
import java.util.*;
import java.io.*;


/**
 *
 * @author parth
 */
public class TCP_Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(3332);
        while(true)
        {
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            int len = dis.readInt();
            System.out.println("Length = " + len);
            int a[] = new int[len];
            int sum = 0;
            for(int i=0;i<len;i++)
            {
                a[i] = dis.readInt();
                sum = sum + a[i];
            }
            Arrays.sort(a);
            
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeInt(sum);
            for(int i=0;i<len;i++)
            {
                dos.writeInt(a[i]);
            }
            
            dis.close();
            dos.close();
        }
    }
}
