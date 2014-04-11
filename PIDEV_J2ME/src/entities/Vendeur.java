/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import handlers.VendeurHandler;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author Internet
 */
public class Vendeur {
  private int idVendeur;
  private String nomCommercial;
  private String addresse;
  private String typeBien;
  private  String description;
  private double posx;
  private double posy;

    public double getPosx() {
        return posx;
    }

    public void setPosx(double posx) {
        this.posx = posx;
    }

    public double getPosy() {
        return posy;
    }

    public void setPosy(double posy) {
        this.posy = posy;
    }
  private float note;

  

    public void setIdVendeur(int idVendeur) {
        this.idVendeur = idVendeur;
    }

    public void setNomCommercial(String nomCommercial) {
        this.nomCommercial = nomCommercial;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setTypeBien(String typeBien) {
        this.typeBien = typeBien;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public int getIdVendeur() {
        return idVendeur;
    }

    public String getNomCommercial() {
        return nomCommercial;
    }

    public String getAddresse() {
        return addresse;
    }

    public String getTypeBien() {
        return typeBien;
    }

    public String getDescription() {
        return description;
    }

    public float getNote() {
        return note;
    }
  
}
