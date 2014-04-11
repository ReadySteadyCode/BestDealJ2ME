/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package handlers;

import entities.Vendeur;
import java.util.Vector;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Internet
 */
public class VendeurHandler extends DefaultHandler{
    private Vector vendeurs;
    public String posx = "close";
    public String posy = "close";
    
   
    private Vendeur venCourant;
    
     public Vendeur[] getVendeur() {
        Vendeur[] personness = new Vendeur[vendeurs.size()];
        vendeurs.copyInto(personness);
        return personness;
    }

    public VendeurHandler() {
        vendeurs = new Vector();
       
        
    }
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("vendeur")) {

            if (venCourant != null) {
                throw new IllegalStateException("already processing a deal");
            }
            venCourant = new Vendeur();
        } else if (qName.equals("posx")) {
            posx = "open";
        } else if (qName.equals("posy")) {
            posy = "open";
        }
    }
    public void endElement(String uri, String localName, String qName) throws SAXException {

        if (qName.equals("vendeur")) {
            // we are no longer processing a <reg.../> tag
            vendeurs.addElement(venCourant);
            venCourant = null;
        } else if (qName.equals("posx")) {
            posx = "close";
        } else if (qName.equals("posy")) {
            posy = "close";
        } 
    }
     public void characters(char[] ch, int start, int length) throws SAXException {
        // we're only interested in this inside a <phone.../> tag
        if (venCourant != null) {
            // don't forget to trim excess spaces from the ends of the string
            if (posx.equals("open")) {
                String id = new String(ch, start, length).trim();
                double id1= Double.parseDouble(id);
                venCourant.setPosx(id1);
            } else
                if (posy.equals("open")) {
                String nom = new String(ch, start, length).trim();
                double id2= Double.parseDouble(nom);
                venCourant.setPosy(id2);
                }
        }
    }
}
