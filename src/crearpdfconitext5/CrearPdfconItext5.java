/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crearpdfconitext5;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**

https://www.youtube.com/watch?v=PO4mwNzpwJA
* la version 5 es mas simple q la 7
* 
 */
public class CrearPdfconItext5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Document document = new Document();
            //el fichero se genera en la ruta de nuestro proyecto
            String destino = "pdfDAVID.pdf";
            PdfWriter.getInstance(document, new FileOutputStream(destino));
            document.open();
            
            Phrase p = new Phrase("ejemplo texto para crear PDF");
            document.add(p);
            
            document.close();
            System.out.println("se ha creado satisfactoriamente el PDF");
            
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(CrearPdfconItext5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
