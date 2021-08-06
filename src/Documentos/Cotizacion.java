/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Cotizacion extends Documento{

    public Cotizacion(int id, Date fecha) {
        super(id, fecha);
    }

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
