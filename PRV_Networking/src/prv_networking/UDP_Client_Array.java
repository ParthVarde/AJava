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
public class UDP_Client_Array {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3333);
        byte[] rd = new byte[1024];
        byte[] sd = new byte[1024];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array length = ");
        int len = sc.nextInt();
        System.out.print("Enter Elements of Array = ");
        for(int i=0;i<len;i++)
        {
            sd[i] = sc.nextByte();
        }
        InetAddress addr = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(sd, sd.length, addr, 3331);
        ds.send(dp);
        
        ds.close();
    }
}
