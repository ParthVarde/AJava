/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prv;

import java.net.*;
import java.io.*;

/**
 *
 * @author parth
 */
public class TCP_Client_IP {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 3332);
        
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str = dis.readUTF();
        System.out.println("IP = " + str);
        dis.close();
    }
    
}
