/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivosjava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Lab
 */
public class ArquivosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("Registros");
            //file.mkdir();
            //file.delete();

         File arquivo = new File("Registros/inicialização.txt");
          //arquivo.createNewFile();
         
         try{
             
             
          //Aqui serve ara escrever no arquivo
           FileWriter FileWriter  = new FileWriter(arquivo);
           BufferedWriter escrever = new BufferedWriter(FileWriter );
           
           //Essse comando serve para ler o arquivo
            FileReader ler =new FileReader(arquivo);
           BufferedReader lerb = new BufferedReader(ler);
           
           String nome = "Gelaterias Delicia";
           double peso = 350;
           double precoCem = 2.00;
          double preco= (precoCem/100)*peso;
          String vendedor= "Lucas Majado";
          String cliente= "Homem de ferro";
          
          
                   escrever.write(nome);
                   escrever.newLine();
                   escrever.write("Peso: "+peso);
                   escrever.newLine();
                   escrever.write("Preço: "+preco);
                   escrever.newLine();
                   escrever.write("Vendedor: "+vendedor);
                   escrever.newLine();
                   escrever.write("Cliente: "+cliente) ;       
                           
                   escrever.close();
                   FileWriter .close();
         
                  
           
          
           String linha = lerb.readLine();
           
           while(linha!=null){
           
           System.out.println(linha);
          linha = lerb.readLine();
           }
           
         }catch(Exception ex){
         
         
         }
        
    }
    
}
