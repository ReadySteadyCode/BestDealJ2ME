/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package handlers;

import entities.Deal;
import entities.Vendeur;
import java.util.Vector;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Internet
 */
public class DealHandler extends DefaultHandler {
 private Vector mydeals;
    public String idDeal = "close";
    public String titreDeal = "close";
    public String descDeal = "close";
    public String img="close";
    private Deal currentDeal;
    public Deal[] getDeal() {
        Deal[] deals = new Deal[mydeals.size()];
        mydeals.copyInto(deals);
        return deals;
    }
    public DealHandler() {
        mydeals = new Vector();
       }
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("deal")) {

            if (currentDeal != null) {
                throw new IllegalStateException("already processing a deal");
            }
            currentDeal = new Deal();
        } else if (qName.equals("idDeal")) {
            idDeal = "open";
        } else if (qName.equals("titreDeal")) {
            titreDeal = "open";
        }else if (qName.equals("descDeal")) {
            descDeal = "open";
        }else if (qName.equals("img")) {
            titreDeal = "open";
        }
    }
    public void endElement(String uri, String localName, String qName) throws SAXException {

        if (qName.equals("deal")) {
            // we are no longer processing a <reg.../> tag
            mydeals.addElement(currentDeal);
            currentDeal = null;
        } else if (qName.equals("idDeal")) {
            idDeal = "close";
        } else if (qName.equals("titreDeal")) {
            titreDeal = "close";
        }else if (qName.equals("descDeal")) {
            descDeal = "close";
        }else if (qName.equals("img")) {
            titreDeal = "close";
        }
    }
    public void characters(char[] ch, int start, int length) throws SAXException {
        // we're only interested in this inside a <phone.../> tag
        if (currentDeal != null) {
            // don't forget to trim excess spaces from the ends of the string
            if (idDeal.equals("open")) {
                String id = new String(ch, start, length).trim();
                currentDeal.setIddeal(id);
            } else
                if (titreDeal.equals("open")) {
                String nom = new String(ch, start, length).trim();
                currentDeal.setTitre(nom);
                }
            else
                if (descDeal.equals("open")) {
                String des = new String(ch, start, length).trim();
                currentDeal.setDesc(des);
                }
             else
                if (img.equals("open")) {
                String image = new String(ch, start, length).trim();
                currentDeal.setImg("http://localhost:1234/pidv/"+image);
                }
        }
    }
}
