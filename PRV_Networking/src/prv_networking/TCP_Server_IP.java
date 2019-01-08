/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prv_networking;

import java.net.*;
import java.io.*;

/**
 *
 * @author parth
 */
public class TCP_Server_IP {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(3332);
        while(true)
        {
            Socket s = ss.accept();
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(s.getInetAddress().getHostName());
            dos.close();
        }
    }
}
