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
        byte sd[] = new byte[1024];
        byte rd[] = new byte[1024];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Array = ");
        int len = sc.nextInt();
        int a[] = new int[len];
        System.out.print("Enter Elements of Array = ");
        for(int i=0; i<len; i++)
        {
            a[i] = sc.nextInt();
        }
        
        InetAddress add=InetAddress.getByName("localhost");
        String str = Integer.toString(a.length);
        sd = str.getBytes();
        DatagramPacket dp = new DatagramPacket(sd, sd.length, add, 3331);
        ds.send(dp);
        for(int i=0;i<a.length;i++)
        {
            str = Integer.toString(a[i]);
            sd = str.getBytes();
            dp = new DatagramPacket(sd, sd.length, add, 3331);
            ds.send(dp);
        }
        
        DatagramPacket dp1 = new DatagramPacket(rd, rd.length);
        
        int a1[]=new int[len];
        System.out.println("Sorted array = ");
        for (int i=0; i<len; i++) 
        {
            ds.receive(dp1);
            String str1 = new String(dp1.getData());
            str1 = str1.trim();
            a1[i] = Integer.parseInt(str1);
            System.out.println(a1[i]);
        }
        
        ds.receive(dp1);
        String s1 = new String(dp1.getData());
        s1 = s1.trim();
        int sum = Integer.parseInt(s1);
        System.out.println("Sum of Array = " + sum);
        
        ds.close();
    }
}
