/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers.home;

import com.mycompany.proyecto.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author joses
 */
public class ListaDeEventos implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void cambiarListaDeEventos() throws IOException{
        App.cambioDeVista("cliente");
    }
   public void cambiarAsientos() throws IOException{
        App.cambioDeVista("SeleccionarAsientos");
    }
   public void cambiarCompraBoleto() throws IOException{
        App.cambioDeVista("CompraBoletos");
    }
}
