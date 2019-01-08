/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prv;

import java.net.*;
import java.util.*;
/**
 *
 * @author parth
 */
public class UDP_Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2222);
        byte[] rd = new byte[1024];
        byte[] sd = new byte[1024];
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sd = str.getBytes();
        InetAddress addr = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(sd, sd.length, addr, 2221);
        ds.send(dp);
        
        DatagramPacket dp1 = new DatagramPacket(rd, rd.length);
        ds.receive(dp1);
        str = new String(dp1.getData());
        System.out.println("Message = " + str);
        
        ds.close();
    }
}
