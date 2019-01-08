/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prv;
import java.io.DataOutputStream;
import java.net.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author parth
 */
public class Client_HTTP {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",3333);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF(str);
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        str = dis.readUTF();
        System.out.println("Contents of File = " + str);
        dos.close();
        s.close();
    }
}
