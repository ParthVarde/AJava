/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prv_networking;

import java.net.*;
import java.util.*;

/**
 *
 * @author parth
 */
public class UDP_Server_Array {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3331);
        byte[] rd = new byte[1024];
        byte[] sd = new byte[1024];
        DatagramPacket dp = new DatagramPacket(rd, rd.length);
        ds.receive(dp);
        sd = dp.getData();
        System.out.println("Array = " + sd);
        
        ds.close();
    }
}
