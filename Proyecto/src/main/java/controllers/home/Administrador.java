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
public class Administrador implements Initializable {

    /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
        public void cambiarAdministrador() throws IOException{
        App.cambioDeVista("Menu");
    }
         public void cambiarEvento() throws IOException{
        App.cambioDeVista("NuevoEvento");
         }
    public void cambiarListaBoletos() throws IOException{
        App.cambioDeVista("ListaDeBoletos");
    }
    public void cambiarListaUsuario() throws IOException{
        App.cambioDeVista("ListaDeUsuario");
    }
    public void cambiarConsultaDeBoleto() throws IOException{
        App.cambioDeVista("ConsultaDeBoleto");
    }
    public void cambiarCarga() throws IOException{
        App.cambioDeVista("CargarEvento");
    }
}
