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
            
            String name = "www.uol.com.br";
            InetAddress address = InetAddress.getByName(name); 
            System.out.println( "Name:      "+ name);
            System.out.println( "Address:   "+ address.getHostAddress());

        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}
