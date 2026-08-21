package br.ufs.dcomp.InetAddressTest;

import java.net.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            
            String name = "google.com.br";
            InetAddress address[] = InetAddress.getAllByName(name); 
            System.out.println( "Name:      "+ name);
            for (InetAddress adr : address){
               System.out.println( "Address:   "+ adr.getHostAddress());
            }
        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}
