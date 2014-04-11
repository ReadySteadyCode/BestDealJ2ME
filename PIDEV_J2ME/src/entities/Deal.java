/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

/**
 *
 * @author Internet
 */
public class Deal {
    private String Titre;
    private String iddeal;

    public String getIddeal() {
        return iddeal;
    }

    public void setIddeal(String iddeal) {
        this.iddeal = iddeal;
    }
    

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String Titre) {
        this.Titre = Titre;
    }
    private String Desc;
    

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }
    private String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
