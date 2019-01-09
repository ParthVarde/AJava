package prv_networking;

import java.net.*;
import java.util.*;

public class UDP_Server_Array {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3331);
        byte rd[] = new byte[1024];
        byte sd[] = new byte[1024];
        DatagramPacket dp = new DatagramPacket(rd, rd.length);
        ds.receive(dp);
        
        String str = new String(dp.getData());
        str = str.trim();
        int n, sum = 0;
        n = Integer.parseInt(str);
        int a[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            ds.receive(dp);
            str = new String(dp.getData());
            str = str.trim();
            a[i] = Integer.parseInt(str);
            sum = sum + a[i];
        }
        Arrays.sort(a);
        
        InetAddress add = InetAddress.getByName("localhost");
        DatagramPacket dp1;
        
        
        for(int i=0;i<a.length;i++)
        {
            String str1=Integer.toString(a[i]);
            sd = str1.getBytes();
            dp1 = new DatagramPacket(sd, sd.length, add, 3333);
            ds.send(dp1);
        }
        
        String s1 = Integer.toString(sum);
        sd = s1.getBytes();
        dp1 = new DatagramPacket(sd, sd.length, add, 3333);
        ds.send(dp1);
        
        ds.close();
    }
}
