/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dickneom
 */
public class CancionAdmin extends Admin {
    public Canciones canciones;

    public CancionAdmin() {
        canciones = new Canciones();
    }
    
    
    public Cancion editar(Cancion cancion) {

        if (cancion == null) {
            cancion = new Cancion();
        }
        try {
            cancion.setNombre(leerDato("Nombre:"));
            cancion.setAlbum(leerDato("Album:"));
            cancion.setArtista(leerDato("Artista:"));
            cancion.setDuracion(Integer.parseInt(leerDato("Duracion:")));
            cancion.setContador(0);
        } catch (IOException ex) {
            Logger.getLogger(CancionAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cancion;
    }
    
    public void validar(Cancion cancion) {
        
    }
    
    public void agregar(Cancion cancion) {
        
    }
    
    public void actualizar(Cancion cancion) {
        
    }
    
    public void eliminar(int id) {
        
    }
    
    
    
    public void buscarNombre() {
        
    }
    
    public void buscarAlbum() {
        
    }
    
    public void mostraLista() {
        
    }
    
    public void mostrarUno(int id) {
        
    }
    
}