/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/**
 *
 * @author Federico
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* 
        Tipos Pimitivos enteros: byte, short, int, long.
         */
        byte numeroByte = 10;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("valor minimo de byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo de byte: " + Byte.MAX_VALUE);
        byte numeroByte2 = (byte) 129; // conversion a tipo byte
        System.out.println("numeroByte2 = " + numeroByte2);

        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo de short: " + Short.MIN_VALUE);
        System.out.println("valor maximo de short: " + Short.MAX_VALUE);
        short numeroShort2 = (short)32768; // conversion a tipo short
        System.out.println("numeroShort2 = " + numeroShort2);
        
        int numeroInt =10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo de Int: " + Integer.MIN_VALUE);
        System.out.println("valor maximo de Int: " + Integer.MAX_VALUE);
        int numeroInt2 = (int) 2147483648L; //conversion a tipo int 
        System.out.println("numeroInt2 = " + numeroInt2);
        
        long numeroLong = 10;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minimo de Long: " + Long.MIN_VALUE);
        System.out.println("valor maximo de Long: " + Long.MAX_VALUE);
        long numeroLong2 = (long)9223372036854775808D;
        System.out.println("numeroLong2 = " + numeroLong2);
    }

}
