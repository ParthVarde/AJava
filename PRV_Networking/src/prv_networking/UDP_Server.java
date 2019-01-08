/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prv_networking;

import java.net.*;

/**
 *
 * @author parth
 */
public class UDP_Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2221);
        byte[] rd = new byte[1024];
        byte[] sd = new byte[1024];
        DatagramPacket dp = new DatagramPacket(rd, rd.length);
        ds.receive(dp);
        String str = new String(dp.getData());
        System.out.println("Message = " + str);
        
        StringBuffer str1 = new StringBuffer(str.trim());
        str1.reverse();
        str = str1.toString();
        sd = str.getBytes();
        InetAddress addr = InetAddress.getByName("localhost");
        DatagramPacket dp1 = new DatagramPacket(sd, sd.length, addr, 2222);
        ds.send(dp1);
        
        ds.close();
    }
}
