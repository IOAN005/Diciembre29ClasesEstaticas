package main.java.com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProbarPrintWriter {
    public static void main(String[] args) {
        //1.Definicion de variables
        FileWriter fSalida;
        PrintWriter altoNivel;
        try {
            //2.Action E/S
            fSalida=new FileWriter("printWriter1.txt");
            altoNivel=new PrintWriter(fSalida);
            altoNivel.println("escrito desde un PrintWriter");
            altoNivel.format("El nombre del producto %s  tiene un precio %f y hay  %d unidades","te chai",1.333,50);
           //3.Cierre
            altoNivel.flush();
            altoNivel.close();
            fSalida.close();

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
