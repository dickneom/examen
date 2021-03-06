/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.LinkedList;

/**
 *
 * @author dickneom
 */
public class Canciones extends LinkedList<Cancion> {

    public Canciones() {
    }
    
    public void llenar() {
        add(new Cancion(1, "Cancion 1", "Album 1", "Artista 1", 180, 0, true));
        add(new Cancion(2, "Cancion 2", "Album 2", "Artista 2", 280, 0, true));
        add(new Cancion(3, "Cancion 3", "Album 1", "Artista 1", 250, 0, true));
        add(new Cancion(4, "Cancion 4", "Album 3", "Artista 3", 300, 0, false));
        add(new Cancion(5, "Cancion 5", "Album 1", "Artista 1", 330, 0, false));
        add(new Cancion(6, "Cancion 6", "Album 2", "Artista 2", 270, 0, false));
        add(new Cancion(7, "Cancion 7", "Album 3", "Artista 3", 250, 0, true));
        add(new Cancion(8, "Cancion 8", "Album 1", "Artista 1", 190, 0, true));
        add(new Cancion(9, "Cancion 9", "Album 5", "Artista 5", 220, 0, false));
        add(new Cancion(10, "Cancion 10", "Album 1", "Artista 1", 235, 0, false));
        add(new Cancion(11, "Cancion 11", "Album 2", "Artista 2", 240, 0, true));
        add(new Cancion(12, "Cancion 12", "Album 3", "Artista 3", 255, 0, true));
        add(new Cancion(13, "Cancion 13", "Album 5", "Artista 5", 290, 0, true));
        add(new Cancion(14, "Cancion 14", "Album 2", "Artista 2", 350, 0, true));
        add(new Cancion(15, "Cancion 15", "Album 2", "Artista 2", 225, 0, true));
    }
    
    // Busca el indice de una cancion dado su id
    public int buscarIndice(int id) {
        for (int i = 0; i < size(); i++) {
            Cancion cancion = get(i);
            
            if (cancion.getId() == id) {
                return i;
            }
        }
        
        return -1;
    }
    
    // busca una cancion dado su id
    public Cancion buscarPorId(int id) {
        for (int i = 0; i < size(); i++) {
            Cancion cancion = get(i);
            
            if (cancion.getId() == id) {
                return cancion;
            }
        }
        
        return null;
    }
}
