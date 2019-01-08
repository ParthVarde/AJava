/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prv;

import java.net.*;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author parth
 */
public class TCP_Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",3332);
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter length of array = ");
        len = sc.nextInt();
        int a[] = new int[len];
        System.out.print("\nEnter elements of array = ");
        for(int i=0;i<len;i++)
        {
            a[i] = sc.nextInt();
        }
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeInt(len);
        for(int i=0;i<len;i++)
        {
            dos.writeInt(a[i]);
        }
        
        int sum;
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        sum = dis.readInt();
        for(int i=0;i<len;i++)
        {
            a[i] = dis.readInt();
            System.out.println("Array = " + a[i]);
        }
        System.out.println("Sum = " + sum);
        
        dos.close();
        dis.close();
    }
}
