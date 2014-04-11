/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev_j2me;

import handlers.DealHandler;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.*;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.midlet.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.netbeans.microedition.lcdui.SplashScreen;
import org.xml.sax.SAXException;
import utils.GoogleMapsMoveCanvas;

/**
 * @author Internet
 */
public class BestDeal extends MIDlet implements CommandListener, Runnable {

    private boolean midletPaused = false;
    
    DealHandler dealHandler;
    double aa;
    double bb;
     HttpConnection hc;
    DataInputStream dis;
    String url = "http://localhost:1234/pidv/ajout.php";
    String url1 = "http://localhost:1234/pidv/mot.php";
    StringBuffer sb = new StringBuffer();
    int ch;
     Alert a1 = new Alert("Sorry","Votre champ vide", null, AlertType.WARNING);
    int x;
    int id_client;
    boolean nom,prenom;
//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private SplashScreen splashScreen;
    private Form InternauteDeals;
    private Form LoginForm;
    private Spacer spacer;
    private Spacer spacer1;
    private TextField tfn;
    private TextField tfp;
    private Alert alert;
    private CanvasList canvasList;
    private Form DetailDeal;
    private Form DetailVendeur;
    private Form CreateAccountForm;
    private TextField tfNom;
    private TextField tfPrenom;
    private TextField tfPass;
    private TextField tfTel;
    private TextField tfEmail;
    private TextField tfCIN;
    private ChoiceGroup groupe1;
    private DateField dateField;
    private Alert alertCreate;
    private GoogleMapsMoveCanvas googleMapsMoveCanvas;
    private Command exitCommand;
    private Command okCommand;
    private Command backCommand;
    private Command okCommand1;
    private Command backCommand1;
    private Command okCommand2;
    private Command exitCommand1;
    private Command backCommand2;
    private Command okCommand3;
    private Command okCommand4;
    private Command okCommand5;
    private Command cmdValider;
    private Command backCommand3;
    private Command backCommand4;
    private Command backCommand6;
    private Command backCommand5;
    private Image image1;
//</editor-fold>//GEN-END:|fields|0|
    String[] items = {"hello", "ww", "ww", "ww"};
    
    Image[] imageElements;

    /**
     * The BestDeal constructor.
     */
    public BestDeal() {
        try {
            this.imageElements = new Image[]{Image.createImage("/dotnet.png"), Image.createImage("/a.png"), getImage1(), getImage1()};
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {
//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
}//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {
//GEN-END:|3-startMIDlet|0|3-preAction
       
        switchDisplayable(null, getSplashScreen());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
}//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {
//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
}//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code>
     * instance is taken from <code>getDisplay</code> method. This method is
     * used by all actions in the design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display; if
     * <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {
//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
}//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {
//GEN-END:|7-commandAction|0|7-preCommandAction
  
        if (displayable == CreateAccountForm) {//GEN-BEGIN:|7-commandAction|1|74-preAction
            if (command == backCommand3) {//GEN-END:|7-commandAction|1|74-preAction
 // write pre-action user code here
switchDisplayable(null, getLoginForm());//GEN-LINE:|7-commandAction|2|74-postAction
 // write post-action user code here
} else if (command == cmdValider) {//GEN-LINE:|7-commandAction|3|77-preAction
 // write pre-action user code here
Createmethod();//GEN-LINE:|7-commandAction|4|77-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|5|61-preAction
        } else if (displayable == DetailDeal) {
            if (command == okCommand3) {//GEN-END:|7-commandAction|5|61-preAction
 // write pre-action user code here
switchDisplayable(null, getDetailVendeur());//GEN-LINE:|7-commandAction|6|61-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|7|91-preAction
        } else if (displayable == DetailVendeur) {
            if (command == backCommand5) {//GEN-END:|7-commandAction|7|91-preAction
 // write pre-action user code here
switchDisplayable(null, getDetailDeal());//GEN-LINE:|7-commandAction|8|91-postAction
 // write post-action user code here
} else if (command == okCommand4) {//GEN-LINE:|7-commandAction|9|65-preAction
 Thread th = new Thread(this);
            th.start();
                switchDisplayable(null, getGoogleMapsMoveCanvas());//GEN-LINE:|7-commandAction|10|65-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|11|22-preAction
        } else if (displayable == InternauteDeals) {
            if (command == exitCommand) {//GEN-END:|7-commandAction|11|22-preAction
 // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|12|22-postAction
 // write post-action user code here
} else if (command == okCommand) {//GEN-LINE:|7-commandAction|13|24-preAction
 // write pre-action user code here
switchDisplayable(null, getLoginForm());//GEN-LINE:|7-commandAction|14|24-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|15|32-preAction
        } else if (displayable == LoginForm) {
            if (command == backCommand) {//GEN-END:|7-commandAction|15|32-preAction
 // write pre-action user code here
switchDisplayable(null, getInternauteDeals());//GEN-LINE:|7-commandAction|16|32-postAction
 // write post-action user code here
} else if (command == okCommand1) {//GEN-LINE:|7-commandAction|17|35-preAction
 // write pre-action user code here
LoginMethod();//GEN-LINE:|7-commandAction|18|35-postAction
 // write post-action user code here
} else if (command == okCommand5) {//GEN-LINE:|7-commandAction|19|68-preAction
 // write pre-action user code here
switchDisplayable(null, getCreateAccountForm());//GEN-LINE:|7-commandAction|20|68-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|21|45-preAction
        } else if (displayable == alert) {
            if (command == backCommand1) {//GEN-END:|7-commandAction|21|45-preAction
 // write pre-action user code here
switchDisplayable(null, getLoginForm());//GEN-LINE:|7-commandAction|22|45-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|23|87-preAction
        } else if (displayable == alertCreate) {
            if (command == backCommand4) {//GEN-END:|7-commandAction|23|87-preAction
 // write pre-action user code here
switchDisplayable(null, getCreateAccountForm());//GEN-LINE:|7-commandAction|24|87-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|25|56-preAction
        } else if (displayable == canvasList) {
            if (command == exitCommand1) {//GEN-END:|7-commandAction|25|56-preAction
 // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|26|56-postAction
 // write post-action user code here
} else if (command == okCommand2) {//GEN-LINE:|7-commandAction|27|50-preAction
 // write pre-action user code here
switchDisplayable(null, getDetailDeal());//GEN-LINE:|7-commandAction|28|50-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|29|96-preAction
        } else if (displayable == googleMapsMoveCanvas) {
            if (command == backCommand6) {//GEN-END:|7-commandAction|29|96-preAction
 // write pre-action user code here
switchDisplayable(null, getDetailVendeur());//GEN-LINE:|7-commandAction|30|96-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|31|16-preAction
        } else if (displayable == splashScreen) {
            if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|31|16-preAction
 // write pre-action user code here
switchDisplayable(null, getInternauteDeals());//GEN-LINE:|7-commandAction|32|16-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|33|7-postCommandAction
        }//GEN-END:|7-commandAction|33|7-postCommandAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|34|
//</editor-fold>//GEN-END:|7-commandAction|34|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: splashScreen ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of splashScreen component.
     *
     * @return the initialized component instance
     */
    public SplashScreen getSplashScreen() {
        if (splashScreen == null) {
//GEN-END:|14-getter|0|14-preInit
 // write pre-init user code here
splashScreen = new SplashScreen(getDisplay());//GEN-BEGIN:|14-getter|1|14-postInit
            splashScreen.setTitle("splashScreen");
            splashScreen.setCommandListener(this);
            splashScreen.setFullScreenMode(true);
            splashScreen.setImage(getImage1());//GEN-END:|14-getter|1|14-postInit
            try {
                Player player = Manager.createPlayer(getClass().getResourceAsStream("/starting.wav"), "audio/x-wav");
                player.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }//GEN-BEGIN:|14-getter|2|
        return splashScreen;
    }
//</editor-fold>//GEN-END:|14-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: image1 ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initialized instance of image1 component.
     *
     * @return the initialized component instance
     */
    public Image getImage1() {
        if (image1 == null) {
//GEN-END:|18-getter|0|18-preInit
 // write pre-init user code here
try {//GEN-BEGIN:|18-getter|1|18-@java.io.IOException
                image1 = Image.createImage("/a.png");
            } catch (java.io.IOException e) {//GEN-END:|18-getter|1|18-@java.io.IOException
            }//GEN-LINE:|18-getter|2|18-postInit
 // write post-init user code here
}//GEN-BEGIN:|18-getter|3|
        return image1;
    }
//</editor-fold>//GEN-END:|18-getter|3|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: InternauteDeals ">//GEN-BEGIN:|19-getter|0|19-preInit
    /**
     * Returns an initialized instance of InternauteDeals component.
     *
     * @return the initialized component instance
     */
    public Form getInternauteDeals() {
        if (InternauteDeals == null) {
//GEN-END:|19-getter|0|19-preInit
 // write pre-init user code here
InternauteDeals = new Form("Liste des Deals");//GEN-BEGIN:|19-getter|1|19-postInit
            InternauteDeals.addCommand(getExitCommand());
            InternauteDeals.addCommand(getOkCommand());
            InternauteDeals.setCommandListener(this);//GEN-END:|19-getter|1|19-postInit
 // write post-init user code here
}//GEN-BEGIN:|19-getter|2|
        return InternauteDeals;
    }
//</editor-fold>//GEN-END:|19-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: LoginForm ">//GEN-BEGIN:|26-getter|0|26-preInit
    /**
     * Returns an initialized instance of LoginForm component.
     *
     * @return the initialized component instance
     */
    public Form getLoginForm() {
        if (LoginForm == null) {
//GEN-END:|26-getter|0|26-preInit
 // write pre-init user code here
LoginForm = new Form("form", new Item[]{getSpacer(), getTfn(), getSpacer1(), getTfp()});//GEN-BEGIN:|26-getter|1|26-postInit
            LoginForm.addCommand(getBackCommand());
            LoginForm.addCommand(getOkCommand1());
            LoginForm.addCommand(getOkCommand5());
            LoginForm.setCommandListener(this);//GEN-END:|26-getter|1|26-postInit

        }//GEN-BEGIN:|26-getter|2|
        return LoginForm;
    }
//</editor-fold>//GEN-END:|26-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: spacer ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initialized instance of spacer component.
     *
     * @return the initialized component instance
     */
    public Spacer getSpacer() {
        if (spacer == null) {
//GEN-END:|27-getter|0|27-preInit
 // write pre-init user code here
spacer = new Spacer(240, 1);//GEN-BEGIN:|27-getter|1|27-postInit
            spacer.setPreferredSize(240, 70);
            spacer.setLayout(ImageItem.LAYOUT_CENTER | Item.LAYOUT_TOP | Item.LAYOUT_BOTTOM | Item.LAYOUT_VCENTER | Item.LAYOUT_EXPAND);//GEN-END:|27-getter|1|27-postInit
 // write post-init user code here
}//GEN-BEGIN:|27-getter|2|
        return spacer;
    }
//</editor-fold>//GEN-END:|27-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: tfn ">//GEN-BEGIN:|28-getter|0|28-preInit
    /**
     * Returns an initialized instance of tfn component.
     *
     * @return the initialized component instance
     */
    public TextField getTfn() {
        if (tfn == null) {
//GEN-END:|28-getter|0|28-preInit
 // write pre-init user code here
tfn = new TextField("E-mail", null, 32, TextField.EMAILADDR);//GEN-LINE:|28-getter|1|28-postInit
 // write post-init user code here
}//GEN-BEGIN:|28-getter|2|
        return tfn;
    }
//</editor-fold>//GEN-END:|28-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: spacer1 ">//GEN-BEGIN:|29-getter|0|29-preInit
    /**
     * Returns an initialized instance of spacer1 component.
     *
     * @return the initialized component instance
     */
    public Spacer getSpacer1() {
        if (spacer1 == null) {
//GEN-END:|29-getter|0|29-preInit
 // write pre-init user code here
spacer1 = new Spacer(240, 1);//GEN-BEGIN:|29-getter|1|29-postInit
            spacer1.setPreferredSize(240, 15);//GEN-END:|29-getter|1|29-postInit
 // write post-init user code here
}//GEN-BEGIN:|29-getter|2|
        return spacer1;
    }
//</editor-fold>//GEN-END:|29-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: tfp ">//GEN-BEGIN:|30-getter|0|30-preInit
    /**
     * Returns an initialized instance of tfp component.
     *
     * @return the initialized component instance
     */
    public TextField getTfp() {
        if (tfp == null) {
//GEN-END:|30-getter|0|30-preInit
 // write pre-init user code here
tfp = new TextField("Mot de Passe", null, 32, TextField.ANY | TextField.PASSWORD | TextField.SENSITIVE);//GEN-LINE:|30-getter|1|30-postInit
 // write post-init user code here
}//GEN-BEGIN:|30-getter|2|
        return tfp;
    }
//</editor-fold>//GEN-END:|30-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|21-getter|0|21-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {
//GEN-END:|21-getter|0|21-preInit
 // write pre-init user code here
exitCommand = new Command("Quitter", Command.EXIT, 0);//GEN-LINE:|21-getter|1|21-postInit
 // write post-init user code here
}//GEN-BEGIN:|21-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|21-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|23-getter|0|23-preInit
    /**
     * Returns an initialized instance of okCommand component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {
//GEN-END:|23-getter|0|23-preInit
 // write pre-init user code here
okCommand = new Command("s\'authentifier", Command.OK, 0);//GEN-LINE:|23-getter|1|23-postInit
 // write post-init user code here
}//GEN-BEGIN:|23-getter|2|
        return okCommand;
    }
//</editor-fold>//GEN-END:|23-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|31-getter|0|31-preInit
    /**
     * Returns an initialized instance of backCommand component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {
//GEN-END:|31-getter|0|31-preInit
 // write pre-init user code here
backCommand = new Command("Retour", Command.BACK, 0);//GEN-LINE:|31-getter|1|31-postInit
 // write post-init user code here
}//GEN-BEGIN:|31-getter|2|
        return backCommand;
    }
//</editor-fold>//GEN-END:|31-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand1 ">//GEN-BEGIN:|34-getter|0|34-preInit
    /**
     * Returns an initialized instance of okCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand1() {
        if (okCommand1 == null) {
//GEN-END:|34-getter|0|34-preInit
 // write pre-init user code here
okCommand1 = new Command("se connecter", Command.OK, 0);//GEN-LINE:|34-getter|1|34-postInit
 // write post-init user code here
}//GEN-BEGIN:|34-getter|2|
        return okCommand1;
    }
//</editor-fold>//GEN-END:|34-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: LoginMethod ">//GEN-BEGIN:|38-if|0|38-preIf
    /**
     * Performs an action assigned to the LoginMethod if-point.
     */
    public void LoginMethod() {
//GEN-END:|38-if|0|38-preIf
         x=2;
//             if (tfp.getString().equals("")) {
//               a1.setTimeout(Alert.FOREVER);
//                getDisplay().setCurrent(a1);}
//             if (tfn.getString().equals("")) {
//                a1.setTimeout(Alert.FOREVER);
//                getDisplay().setCurrent(a1);}
         System.out.println(nom);
            Thread th1 = new Thread(BestDeal.this);
            th1.start();
        try {
            th1.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(nom);
       
        if (nom == true) {//GEN-LINE:|38-if|1|39-preAction
 x=3;
 Thread th2 = new Thread(BestDeal.this);
 th2.start();
  try {
            th2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
switchDisplayable(null, getCanvasList());//GEN-LINE:|38-if|2|39-postAction
 
} else {//GEN-LINE:|38-if|3|40-preAction
            System.out.println(nom);
            switchDisplayable(null, getAlert());//GEN-LINE:|38-if|4|40-postAction
 // write post-action user code here
}//GEN-LINE:|38-if|5|38-postIf
 // enter post-if user code here
}//GEN-BEGIN:|38-if|6|
//</editor-fold>//GEN-END:|38-if|6|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: alert ">//GEN-BEGIN:|42-getter|0|42-preInit
    /**
     * Returns an initialized instance of alert component.
     *
     * @return the initialized component instance
     */
    public Alert getAlert() {
        if (alert == null) {
//GEN-END:|42-getter|0|42-preInit
 // write pre-init user code here
alert = new Alert("alert");//GEN-BEGIN:|42-getter|1|42-postInit
            alert.addCommand(getBackCommand1());
            alert.setCommandListener(this);
            alert.setTimeout(Alert.FOREVER);//GEN-END:|42-getter|1|42-postInit
 // write post-init user code here
}//GEN-BEGIN:|42-getter|2|
        return alert;
    }
//</editor-fold>//GEN-END:|42-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand1 ">//GEN-BEGIN:|44-getter|0|44-preInit
    /**
     * Returns an initialized instance of backCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand1() {
        if (backCommand1 == null) {
//GEN-END:|44-getter|0|44-preInit
 // write pre-init user code here
backCommand1 = new Command("Back", Command.BACK, 0);//GEN-LINE:|44-getter|1|44-postInit
 // write post-init user code here
}//GEN-BEGIN:|44-getter|2|
        return backCommand1;
    }
//</editor-fold>//GEN-END:|44-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: canvasList ">//GEN-BEGIN:|47-getter|0|47-preInit
    /**
     * Returns an initialized instance of canvasList component.
     *
     * @return the initialized component instance
     */
    public CanvasList getCanvasList() {
        if (canvasList == null) {
//GEN-END:|47-getter|0|47-preInit
 // write pre-init user code here
canvasList = new CanvasList("Ma Liste de Deals", items, imageElements);//GEN-BEGIN:|47-getter|1|47-postInit
            canvasList.setTitle("canvasList");
            canvasList.addCommand(getOkCommand2());
            canvasList.addCommand(getExitCommand1());
            canvasList.setCommandListener(this);//GEN-END:|47-getter|1|47-postInit

        }//GEN-BEGIN:|47-getter|2|
        return canvasList;
    }
//</editor-fold>//GEN-END:|47-getter|2|


//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand2 ">//GEN-BEGIN:|49-getter|0|49-preInit
    /**
     * Returns an initialized instance of okCommand2 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand2() {
        if (okCommand2 == null) {
//GEN-END:|49-getter|0|49-preInit
 // write pre-init user code here
okCommand2 = new Command("Afficher les D\u00E9tails", Command.OK, 0);//GEN-LINE:|49-getter|1|49-postInit
 // write post-init user code here
}//GEN-BEGIN:|49-getter|2|
        return okCommand2;
    }
//</editor-fold>//GEN-END:|49-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: DetailDeal ">//GEN-BEGIN:|58-getter|0|58-preInit
    /**
     * Returns an initialized instance of DetailDeal component.
     *
     * @return the initialized component instance
     */
    public Form getDetailDeal() {
        if (DetailDeal == null) {
//GEN-END:|58-getter|0|58-preInit
 // write pre-init user code here
DetailDeal = new Form("D\u00E9tail sur le Deal");//GEN-BEGIN:|58-getter|1|58-postInit
            DetailDeal.addCommand(getOkCommand3());
            DetailDeal.setCommandListener(this);//GEN-END:|58-getter|1|58-postInit
 // write post-init user code here
}//GEN-BEGIN:|58-getter|2|
        return DetailDeal;
    }
//</editor-fold>//GEN-END:|58-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: DetailVendeur ">//GEN-BEGIN:|62-getter|0|62-preInit
    /**
     * Returns an initialized instance of DetailVendeur component.
     *
     * @return the initialized component instance
     */
    public Form getDetailVendeur() {
        if (DetailVendeur == null) {
//GEN-END:|62-getter|0|62-preInit
 // write pre-init user code here
DetailVendeur = new Form("D\u00E9tails sur le vendeur");//GEN-BEGIN:|62-getter|1|62-postInit
            DetailVendeur.addCommand(getOkCommand4());
            DetailVendeur.addCommand(getBackCommand5());
            DetailVendeur.setCommandListener(this);//GEN-END:|62-getter|1|62-postInit
 // write post-init user code here
}//GEN-BEGIN:|62-getter|2|
        return DetailVendeur;
    }
//</editor-fold>//GEN-END:|62-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand2 ">//GEN-BEGIN:|53-getter|0|53-preInit
    /**
     * Returns an initialized instance of backCommand2 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand2() {
        if (backCommand2 == null) {
//GEN-END:|53-getter|0|53-preInit
 // write pre-init user code here
backCommand2 = new Command("Back", Command.BACK, 0);//GEN-LINE:|53-getter|1|53-postInit
 // write post-init user code here
}//GEN-BEGIN:|53-getter|2|
        return backCommand2;
    }
//</editor-fold>//GEN-END:|53-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|55-getter|0|55-preInit
    /**
     * Returns an initialized instance of exitCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand1() {
        if (exitCommand1 == null) {
//GEN-END:|55-getter|0|55-preInit
 // write pre-init user code here
exitCommand1 = new Command("Quitter", Command.EXIT, 0);//GEN-LINE:|55-getter|1|55-postInit
 // write post-init user code here
}//GEN-BEGIN:|55-getter|2|
        return exitCommand1;
    }
//</editor-fold>//GEN-END:|55-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand3 ">//GEN-BEGIN:|60-getter|0|60-preInit
    /**
     * Returns an initialized instance of okCommand3 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand3() {
        if (okCommand3 == null) {
//GEN-END:|60-getter|0|60-preInit
 // write pre-init user code here
okCommand3 = new Command("D\u00E9tails sur le vendeur", Command.OK, 0);//GEN-LINE:|60-getter|1|60-postInit
 // write post-init user code here
}//GEN-BEGIN:|60-getter|2|
        return okCommand3;
    }
//</editor-fold>//GEN-END:|60-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand4 ">//GEN-BEGIN:|64-getter|0|64-preInit
    /**
     * Returns an initialized instance of okCommand4 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand4() {
        if (okCommand4 == null) {
//GEN-END:|64-getter|0|64-preInit
 // write pre-init user code here
okCommand4 = new Command("Afficher sur la carte", Command.OK, 0);//GEN-LINE:|64-getter|1|64-postInit
 // write post-init user code here
}//GEN-BEGIN:|64-getter|2|
        return okCommand4;
    }
//</editor-fold>//GEN-END:|64-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: Createmethod ">//GEN-BEGIN:|78-if|0|78-preIf
    /**
     * Performs an action assigned to the Createmethod if-point.
     */
    public void Createmethod() {
//GEN-END:|78-if|0|78-preIf
 x=1;
 
 Thread th0 = new Thread(this);
 th0.start();
 
        if (prenom = true) {//GEN-LINE:|78-if|1|79-preAction
 // write pre-action user code here
switchDisplayable(null, getLoginForm());//GEN-LINE:|78-if|2|79-postAction
 // write post-action user code here
} else {//GEN-LINE:|78-if|3|80-preAction
 // write pre-action user code here
switchDisplayable(null, getAlertCreate());//GEN-LINE:|78-if|4|80-postAction
 // write post-action user code here
}//GEN-LINE:|78-if|5|78-postIf
 // enter post-if user code here
}//GEN-BEGIN:|78-if|6|
//</editor-fold>//GEN-END:|78-if|6|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: CreateAccountForm ">//GEN-BEGIN:|71-getter|0|71-preInit
    /**
     * Returns an initialized instance of CreateAccountForm component.
     *
     * @return the initialized component instance
     */
    public Form getCreateAccountForm() {
        if (CreateAccountForm == null) {
//GEN-END:|71-getter|0|71-preInit
 // write pre-init user code here
CreateAccountForm = new Form("form1", new Item[]{getTfNom(), getTfPrenom(), getTfPass(), getTfTel(), getTfEmail(), getTfCIN(), getGroupe1(), getDateField()});//GEN-BEGIN:|71-getter|1|71-postInit
            CreateAccountForm.addCommand(getBackCommand3());
            CreateAccountForm.addCommand(getCmdValider());
            CreateAccountForm.setCommandListener(this);//GEN-END:|71-getter|1|71-postInit
 // write post-init user code here
}//GEN-BEGIN:|71-getter|2|
        return CreateAccountForm;
    }
//</editor-fold>//GEN-END:|71-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: alertCreate ">//GEN-BEGIN:|83-getter|0|83-preInit
    /**
     * Returns an initialized instance of alertCreate component.
     *
     * @return the initialized component instance
     */
    public Alert getAlertCreate() {
        if (alertCreate == null) {
//GEN-END:|83-getter|0|83-preInit
 // write pre-init user code here
alertCreate = new Alert("Probl\u00E8me de connexion", "impossible de cr\u00E9er un compte", null, null);//GEN-BEGIN:|83-getter|1|83-postInit
            alertCreate.addCommand(getBackCommand4());
            alertCreate.setCommandListener(this);
            alertCreate.setTimeout(Alert.FOREVER);//GEN-END:|83-getter|1|83-postInit
 // write post-init user code here
}//GEN-BEGIN:|83-getter|2|
        return alertCreate;
    }
//</editor-fold>//GEN-END:|83-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand5 ">//GEN-BEGIN:|67-getter|0|67-preInit
    /**
     * Returns an initialized instance of okCommand5 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand5() {
        if (okCommand5 == null) {
//GEN-END:|67-getter|0|67-preInit
 // write pre-init user code here
okCommand5 = new Command("Cr\u00E9er un compte", Command.OK, 0);//GEN-LINE:|67-getter|1|67-postInit
 // write post-init user code here
}//GEN-BEGIN:|67-getter|2|
        return okCommand5;
    }
//</editor-fold>//GEN-END:|67-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand3 ">//GEN-BEGIN:|73-getter|0|73-preInit
    /**
     * Returns an initialized instance of backCommand3 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand3() {
        if (backCommand3 == null) {
//GEN-END:|73-getter|0|73-preInit
 // write pre-init user code here
backCommand3 = new Command("Back", Command.BACK, 0);//GEN-LINE:|73-getter|1|73-postInit
 // write post-init user code here
}//GEN-BEGIN:|73-getter|2|
        return backCommand3;
    }
//</editor-fold>//GEN-END:|73-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: cmdValider ">//GEN-BEGIN:|76-getter|0|76-preInit
    /**
     * Returns an initialized instance of cmdValider component.
     *
     * @return the initialized component instance
     */
    public Command getCmdValider() {
        if (cmdValider == null) {
//GEN-END:|76-getter|0|76-preInit
 // write pre-init user code here
cmdValider = new Command("Cr\u00E9er", Command.OK, 0);//GEN-LINE:|76-getter|1|76-postInit
 // write post-init user code here
}//GEN-BEGIN:|76-getter|2|
        return cmdValider;
    }
//</editor-fold>//GEN-END:|76-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand4 ">//GEN-BEGIN:|86-getter|0|86-preInit
    /**
     * Returns an initialized instance of backCommand4 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand4() {
        if (backCommand4 == null) {
//GEN-END:|86-getter|0|86-preInit
 // write pre-init user code here
backCommand4 = new Command("Back", Command.BACK, 0);//GEN-LINE:|86-getter|1|86-postInit
 // write post-init user code here
}//GEN-BEGIN:|86-getter|2|
        return backCommand4;
    }
//</editor-fold>//GEN-END:|86-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand5 ">//GEN-BEGIN:|90-getter|0|90-preInit
    /**
     * Returns an initialized instance of backCommand5 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand5() {
        if (backCommand5 == null) {
//GEN-END:|90-getter|0|90-preInit
 // write pre-init user code here
backCommand5 = new Command("Back", Command.BACK, 0);//GEN-LINE:|90-getter|1|90-postInit
 // write post-init user code here
}//GEN-BEGIN:|90-getter|2|
        return backCommand5;
    }
//</editor-fold>//GEN-END:|90-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: googleMapsMoveCanvas ">//GEN-BEGIN:|93-getter|0|93-preInit
    /**
     * Returns an initialized instance of googleMapsMoveCanvas component.
     *
     * @return the initialized component instance
     */
    public GoogleMapsMoveCanvas getGoogleMapsMoveCanvas() {
        if (googleMapsMoveCanvas == null) {
//GEN-END:|93-getter|0|93-preInit
 // write pre-init user code here
googleMapsMoveCanvas = new GoogleMapsMoveCanvas(null, null);//GEN-BEGIN:|93-getter|1|93-postInit
            googleMapsMoveCanvas.setTitle("googleMapsMoveCanvas");
            googleMapsMoveCanvas.addCommand(getBackCommand6());
            googleMapsMoveCanvas.setCommandListener(this);//GEN-END:|93-getter|1|93-postInit
           
        }//GEN-BEGIN:|93-getter|2|
        return googleMapsMoveCanvas;
    }
//</editor-fold>//GEN-END:|93-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand6 ">//GEN-BEGIN:|95-getter|0|95-preInit
    /**
     * Returns an initialized instance of backCommand6 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand6() {
        if (backCommand6 == null) {
//GEN-END:|95-getter|0|95-preInit
 // write pre-init user code here
backCommand6 = new Command("Back", Command.BACK, 0);//GEN-LINE:|95-getter|1|95-postInit
 // write post-init user code here
}//GEN-BEGIN:|95-getter|2|
        return backCommand6;
    }
//</editor-fold>//GEN-END:|95-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: tfNom ">//GEN-BEGIN:|98-getter|0|98-preInit
    /**
     * Returns an initialized instance of tfNom component.
     *
     * @return the initialized component instance
     */
    public TextField getTfNom() {
        if (tfNom == null) {
//GEN-END:|98-getter|0|98-preInit
 // write pre-init user code here
tfNom = new TextField("Nom", null, 32, TextField.ANY);//GEN-LINE:|98-getter|1|98-postInit
 // write post-init user code here
}//GEN-BEGIN:|98-getter|2|
        return tfNom;
    }
//</editor-fold>//GEN-END:|98-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: tfPrenom ">//GEN-BEGIN:|99-getter|0|99-preInit
    /**
     * Returns an initialized instance of tfPrenom component.
     *
     * @return the initialized component instance
     */
    public TextField getTfPrenom() {
        if (tfPrenom == null) {
//GEN-END:|99-getter|0|99-preInit
 // write pre-init user code here
tfPrenom = new TextField("Pr\u00E9nom", null, 32, TextField.ANY);//GEN-LINE:|99-getter|1|99-postInit
 // write post-init user code here
}//GEN-BEGIN:|99-getter|2|
        return tfPrenom;
    }
//</editor-fold>//GEN-END:|99-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: tfPass ">//GEN-BEGIN:|100-getter|0|100-preInit
    /**
     * Returns an initialized instance of tfPass component.
     *
     * @return the initialized component instance
     */
    public TextField getTfPass() {
        if (tfPass == null) {
//GEN-END:|100-getter|0|100-preInit
 // write pre-init user code here
tfPass = new TextField("Mot de Passe", null, 32, TextField.ANY | TextField.PASSWORD);//GEN-LINE:|100-getter|1|100-postInit
 // write post-init user code here
}//GEN-BEGIN:|100-getter|2|
        return tfPass;
    }
//</editor-fold>//GEN-END:|100-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: tfTel ">//GEN-BEGIN:|101-getter|0|101-preInit
    /**
     * Returns an initialized instance of tfTel component.
     *
     * @return the initialized component instance
     */
    public TextField getTfTel() {
        if (tfTel == null) {
//GEN-END:|101-getter|0|101-preInit
 // write pre-init user code here
tfTel = new TextField("T\u00E9l\u00E9phone", null, 32, TextField.NUMERIC);//GEN-LINE:|101-getter|1|101-postInit
 // write post-init user code here
}//GEN-BEGIN:|101-getter|2|
        return tfTel;
    }
//</editor-fold>//GEN-END:|101-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: tfEmail ">//GEN-BEGIN:|102-getter|0|102-preInit
    /**
     * Returns an initialized instance of tfEmail component.
     *
     * @return the initialized component instance
     */
    public TextField getTfEmail() {
        if (tfEmail == null) {
//GEN-END:|102-getter|0|102-preInit
 // write pre-init user code here
tfEmail = new TextField("E-Mail", null, 32, TextField.EMAILADDR);//GEN-LINE:|102-getter|1|102-postInit
 // write post-init user code here
}//GEN-BEGIN:|102-getter|2|
        return tfEmail;
    }
//</editor-fold>//GEN-END:|102-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: tfCIN ">//GEN-BEGIN:|103-getter|0|103-preInit
    /**
     * Returns an initialized instance of tfCIN component.
     *
     * @return the initialized component instance
     */
    public TextField getTfCIN() {
        if (tfCIN == null) {
//GEN-END:|103-getter|0|103-preInit
 // write pre-init user code here
tfCIN = new TextField("CIN", null, 32, TextField.NUMERIC);//GEN-LINE:|103-getter|1|103-postInit
 // write post-init user code here
}//GEN-BEGIN:|103-getter|2|
        return tfCIN;
    }
//</editor-fold>//GEN-END:|103-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: groupe1 ">//GEN-BEGIN:|104-getter|0|104-preInit
    /**
     * Returns an initialized instance of groupe1 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getGroupe1() {
        if (groupe1 == null) {
//GEN-END:|104-getter|0|104-preInit
 // write pre-init user code here
groupe1 = new ChoiceGroup("Sexe", Choice.EXCLUSIVE);//GEN-BEGIN:|104-getter|1|104-postInit
            groupe1.append("Femme", null);
            groupe1.append("Homme", null);
            groupe1.setSelectedFlags(new boolean[]{false, false});//GEN-END:|104-getter|1|104-postInit
 // write post-init user code here
}//GEN-BEGIN:|104-getter|2|
        return groupe1;
    }
//</editor-fold>//GEN-END:|104-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: dateField ">//GEN-BEGIN:|110-getter|0|110-preInit
    /**
     * Returns an initialized instance of dateField component.
     *
     * @return the initialized component instance
     */
    public DateField getDateField() {
        if (dateField == null) {
//GEN-END:|110-getter|0|110-preInit
 // write pre-init user code here
dateField = new DateField("Date de Naissance", DateField.DATE_TIME);//GEN-BEGIN:|110-getter|1|110-postInit
            dateField.setDate(new java.util.Date(System.currentTimeMillis()));//GEN-END:|110-getter|1|110-postInit
 // write post-init user code here
}//GEN-BEGIN:|110-getter|2|
        return dateField;
    }
//</editor-fold>//GEN-END:|110-getter|2|

    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
           
        }
        midletPaused = false;
      }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

    public void run() {
        String y="";
         if (x==1) {
           
            String sexe="";
            sexe=groupe1.getString(groupe1.getSelectedIndex()+1);
            
        try {
            if ((sexe.equalsIgnoreCase("Femme"))) 
                y="1";
               else 
                y="0";
            
          
           String sh = dateField.getDate().toString(); 
           String datenaissance1 =replaceAll(sh," ", "");
          String datenaissance2 = replaceAll(datenaissance1,":", "");
           String datenaissance = replaceAll(datenaissance2,"000000UTC", "");
            String query=url + "?nom=" + tfNom.getString()
                    + "&prenom=" + tfPrenom.getString()
                    + "&password=" + tfPass.getString()
                    + "&Telephone=" + tfTel.getString() 
                    + "&email=" + tfEmail.getString()+"&list"
                    + "&CIN=" + tfCIN.getString()
                   // +"&choix="+groupe.getString(groupe.getSelectedIndex())
                    + "&listedechoix="
                    +"&datenaissance="+datenaissance +"&sexe="+ y 
                    +"&nbrSignalisation=";
//                
            System.out.println(query);
            hc = (HttpConnection) Connector.open(query);
            
            dis = new DataInputStream(hc.openDataInputStream());
            while ((ch = dis.read()) != -1) {
                sb.append((char) ch);
            }
            if ("successfully added".equalsIgnoreCase(sb.toString().trim())) {
                System.out.println(sb.toString());
                  prenom=true;
                tfNom.setString("");
                tfPrenom.setString("");
                tfPass.setString("");
                tfEmail.setString("");
                tfCIN.setString("");
                tfTel.setString("");
               
                sb=new StringBuffer();
            } else {
                System.out.println("erreur");
                prenom=false;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }else
        if (x==2)
    { try {
          StringBuffer sb1=new StringBuffer();
             
            hc = (HttpConnection) Connector.open(url1 + "?email=" + tfn.getString()
                   
                    + "&password=" + tfp.getString()
                    );
                  
            dis = new DataInputStream(hc.openDataInputStream());
            while ((ch = dis.read()) != -1) {
                sb1.append((char) ch);
            }
            if (sb1.toString().equals("")==false) {
                nom=true;
                tfn.setString("");
                tfp.setString("");
                //id_client=Integer.parseInt(sb1.toString());
                System.out.println(sb1);
                
               
            } else {
                System.out.println(sb1.toString()+"falsefalse");
                nom=false;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
         if(x==3){
            try {
                dealHandler = new DealHandler();
                SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
                HttpConnection hc = (HttpConnection) Connector.open("http://localhost:1234/pidv/getdeal.php");
                DataInputStream dis = new DataInputStream(hc.openDataInputStream());
                parser.parse(dis, dealHandler);
                String [] ab = null;
                for(int i=0;i<dealHandler.getDeal().length;i++){
                ab[i] = dealHandler.getDeal()[i].getTitre();
                System.out.println(ab[i]);
                }
            }
//        try {
//
//            VendeurHandler handler = new VendeurHandler();
//            
//            SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
//            // get an InputStream from somewhere (could be HttpConnection, for example)
//            HttpConnection hc = (HttpConnection) Connector.open("http://localhost:1234/pidev/getXmlPersonnes.php");
//            DataInputStream dis = new DataInputStream(hc.openDataInputStream());
//            System.out.println(handler.posx);
//            parser.parse(dis, handler);
//            Vendeur a1 = handler.getVendeur()[0];
//            this.getGoogleMapsMoveCanvas().a=a1.getPosx();
//            this.getGoogleMapsMoveCanvas().b=a1.getPosy();
//            aa=a1.getPosx();
//            bb=a1.getPosy();
//            System.out.println(googleMapsMoveCanvas.b);
//
//            
//        } catch (ParserConfigurationException ex) {
//        } catch (SAXException ex) {
//        } catch (IOException ex) {
//        }
            catch (IOException ex) {
                ex.printStackTrace();
            } catch (ParserConfigurationException ex) {
                ex.printStackTrace();
            } catch (SAXException ex) {
                ex.printStackTrace();
            }
         }
    }
  public static String replaceAll(String text, String searchString, String replacementString) {
     StringBuffer sBuffer = new StringBuffer();
     int pos = 0;
     while ((pos = text.indexOf(searchString)) != -1) {
      sBuffer.append(text.substring(0, pos) + replacementString);
      text = text.substring(pos + searchString.length());
     }
     sBuffer.append(text);
     return sBuffer.toString();
    }
}
