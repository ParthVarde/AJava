package prv;

import java.net.*;
import java.io.*;
import java.util.*;

public class Client_reverse {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",3335);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF(str);

        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        str = dis.readUTF();
        System.out.println(str);

        dos.close();
        dis.close();
        s.close();
    }
}
