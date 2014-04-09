/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pidev_j2me;

import javax.microedition.lcdui.*;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.midlet.*;
import org.netbeans.microedition.lcdui.SplashScreen;

/**
 * @author Internet
 */
public class VisualMIDlet extends MIDlet implements CommandListener,Runnable {
    
    private boolean midletPaused = false;

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private SplashScreen splashScreen;
    private Form internauteDeals;
    private Form Login;
    private Spacer spacer1;
    private TextField passField;
    private Spacer spacer;
    private TextField loginField;
    private Alert alertCon;
    private Form DealListe;
    private Command exitCommand;
    private Command okCommand;
    private Command backCommand;
    private Command okCommand1;
    private Image image1;
    private Ticker ticker;
//</editor-fold>//GEN-END:|fields|0|
    /**
     * The VisualMIDlet constructor.
     */
    public VisualMIDlet() {
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
        // write pre-action user code here
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
 // write pre-action user code here
if (displayable == Login) {//GEN-BEGIN:|7-commandAction|1|28-preAction
            if (command == backCommand) {//GEN-END:|7-commandAction|1|28-preAction
 // write pre-action user code here
switchDisplayable(null, getInternauteDeals());//GEN-LINE:|7-commandAction|2|28-postAction
 // write post-action user code here
} else if (command == okCommand1) {//GEN-LINE:|7-commandAction|3|31-preAction
 // write pre-action user code here
LoginMethod();//GEN-LINE:|7-commandAction|4|31-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|5|21-preAction
} else if (displayable == internauteDeals) {
    if (command == exitCommand) {//GEN-END:|7-commandAction|5|21-preAction
 // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|6|21-postAction
 // write post-action user code here
} else if (command == okCommand) {//GEN-LINE:|7-commandAction|7|24-preAction
 // write pre-action user code here
switchDisplayable(null, getLogin());//GEN-LINE:|7-commandAction|8|24-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|9|16-preAction
} else if (displayable == splashScreen) {
    if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|9|16-preAction
 // write pre-action user code here
switchDisplayable(null, getInternauteDeals());//GEN-LINE:|7-commandAction|10|16-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|11|7-postCommandAction
        }//GEN-END:|7-commandAction|11|7-postCommandAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|12|
//</editor-fold>//GEN-END:|7-commandAction|12|

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

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: internauteDeals ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initialized instance of internauteDeals component.
     *
     * @return the initialized component instance
     */
    public Form getInternauteDeals() {
        if (internauteDeals == null) {
//GEN-END:|18-getter|0|18-preInit
 // write pre-init user code here
internauteDeals = new Form("form");//GEN-BEGIN:|18-getter|1|18-postInit
            internauteDeals.addCommand(getExitCommand());
            internauteDeals.addCommand(getOkCommand());
            internauteDeals.setCommandListener(this);//GEN-END:|18-getter|1|18-postInit
 // write post-init user code here
}//GEN-BEGIN:|18-getter|2|
        return internauteDeals;
    }
//</editor-fold>//GEN-END:|18-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|20-getter|0|20-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {
//GEN-END:|20-getter|0|20-preInit
 // write pre-init user code here
exitCommand = new Command("Quitter", Command.EXIT, 0);//GEN-LINE:|20-getter|1|20-postInit
 // write post-init user code here
}//GEN-BEGIN:|20-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|20-getter|2|

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

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: image1 ">//GEN-BEGIN:|25-getter|0|25-preInit
    /**
     * Returns an initialized instance of image1 component.
     *
     * @return the initialized component instance
     */
    public Image getImage1() {
        if (image1 == null) {
//GEN-END:|25-getter|0|25-preInit
 // write pre-init user code here
try {//GEN-BEGIN:|25-getter|1|25-@java.io.IOException
                image1 = Image.createImage("/a.png");
            } catch (java.io.IOException e) {//GEN-END:|25-getter|1|25-@java.io.IOException
            }//GEN-LINE:|25-getter|2|25-postInit
 // write post-init user code here
}//GEN-BEGIN:|25-getter|3|
        return image1;
    }
//</editor-fold>//GEN-END:|25-getter|3|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: LoginMethod ">//GEN-BEGIN:|32-if|0|32-preIf
    /**
     * Performs an action assigned to the LoginMethod if-point.
     */
    public void LoginMethod() {
//GEN-END:|32-if|0|32-preIf
 boolean nom=false;
        if (nom == true) {//GEN-LINE:|32-if|1|33-preAction
 // write pre-action user code here
switchDisplayable(null, getDealListe());//GEN-LINE:|32-if|2|33-postAction
 // write post-action user code here
} else {//GEN-LINE:|32-if|3|34-preAction
 // write pre-action user code here
switchDisplayable(null, getAlertCon());//GEN-LINE:|32-if|4|34-postAction
 // write post-action user code here
}//GEN-LINE:|32-if|5|32-postIf
 // enter post-if user code here
}//GEN-BEGIN:|32-if|6|
//</editor-fold>//GEN-END:|32-if|6|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Login ">//GEN-BEGIN:|26-getter|0|26-preInit
    /**
     * Returns an initialized instance of Login component.
     *
     * @return the initialized component instance
     */
    public Form getLogin() {
        if (Login == null) {
//GEN-END:|26-getter|0|26-preInit
 // write pre-init user code here
Login = new Form("form", new Item[]{getSpacer(), getLoginField(), getSpacer1(), getPassField()});//GEN-BEGIN:|26-getter|1|26-postInit
            Login.addCommand(getBackCommand());
            Login.addCommand(getOkCommand1());
            Login.setCommandListener(this);//GEN-END:|26-getter|1|26-postInit
 // write post-init user code here
}//GEN-BEGIN:|26-getter|2|
        return Login;
    }
//</editor-fold>//GEN-END:|26-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: spacer ">//GEN-BEGIN:|44-getter|0|44-preInit
    /**
     * Returns an initialized instance of spacer component.
     *
     * @return the initialized component instance
     */
    public Spacer getSpacer() {
        if (spacer == null) {
//GEN-END:|44-getter|0|44-preInit
 // write pre-init user code here
spacer = new Spacer(240, 1);//GEN-BEGIN:|44-getter|1|44-postInit
            spacer.setPreferredSize(240, 70);//GEN-END:|44-getter|1|44-postInit
 // write post-init user code here
}//GEN-BEGIN:|44-getter|2|
        return spacer;
    }
//</editor-fold>//GEN-END:|44-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: loginField ">//GEN-BEGIN:|45-getter|0|45-preInit
    /**
     * Returns an initialized instance of loginField component.
     *
     * @return the initialized component instance
     */
    public TextField getLoginField() {
        if (loginField == null) {
//GEN-END:|45-getter|0|45-preInit
 // write pre-init user code here
loginField = new TextField("E-mail", "", 250, TextField.EMAILADDR);//GEN-LINE:|45-getter|1|45-postInit
 // write post-init user code here
}//GEN-BEGIN:|45-getter|2|
        return loginField;
    }
//</editor-fold>//GEN-END:|45-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: alertCon ">//GEN-BEGIN:|35-getter|0|35-preInit
    /**
     * Returns an initialized instance of alertCon component.
     *
     * @return the initialized component instance
     */
    public Alert getAlertCon() {
        if (alertCon == null) {
//GEN-END:|35-getter|0|35-preInit
 // write pre-init user code here
alertCon = new Alert("imossible de se connecter", "Veuillez verifier vos Coordonn\u00E9es", null, AlertType.ERROR);//GEN-BEGIN:|35-getter|1|35-postInit
            alertCon.setTimeout(Alert.FOREVER);//GEN-END:|35-getter|1|35-postInit
 // write post-init user code here
}//GEN-BEGIN:|35-getter|2|
        return alertCon;
    }
//</editor-fold>//GEN-END:|35-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: DealListe ">//GEN-BEGIN:|41-getter|0|41-preInit
    /**
     * Returns an initialized instance of DealListe component.
     *
     * @return the initialized component instance
     */
    public Form getDealListe() {
        if (DealListe == null) {
//GEN-END:|41-getter|0|41-preInit
 // write pre-init user code here
DealListe = new Form("Liste Des Deals");//GEN-LINE:|41-getter|1|41-postInit
 // write post-init user code here
}//GEN-BEGIN:|41-getter|2|
        return DealListe;
    }
//</editor-fold>//GEN-END:|41-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initialized instance of backCommand component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {
//GEN-END:|27-getter|0|27-preInit
 // write pre-init user code here
backCommand = new Command("Retour", Command.BACK, 0);//GEN-LINE:|27-getter|1|27-postInit
 // write post-init user code here
}//GEN-BEGIN:|27-getter|2|
        return backCommand;
    }
//</editor-fold>//GEN-END:|27-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand1 ">//GEN-BEGIN:|30-getter|0|30-preInit
    /**
     * Returns an initialized instance of okCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand1() {
        if (okCommand1 == null) {
//GEN-END:|30-getter|0|30-preInit
 // write pre-init user code here
okCommand1 = new Command("Se connecter", Command.OK, 0);//GEN-LINE:|30-getter|1|30-postInit
 // write post-init user code here
}//GEN-BEGIN:|30-getter|2|
        return okCommand1;
    }
//</editor-fold>//GEN-END:|30-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: ticker ">//GEN-BEGIN:|39-getter|0|39-preInit
    /**
     * Returns an initialized instance of ticker component.
     *
     * @return the initialized component instance
     */
    public Ticker getTicker() {
        if (ticker == null) {
//GEN-END:|39-getter|0|39-preInit
 // write pre-init user code here
ticker = new Ticker("");//GEN-LINE:|39-getter|1|39-postInit
 // write post-init user code here
}//GEN-BEGIN:|39-getter|2|
        return ticker;
    }
//</editor-fold>//GEN-END:|39-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: spacer1 ">//GEN-BEGIN:|46-getter|0|46-preInit
    /**
     * Returns an initialized instance of spacer1 component.
     *
     * @return the initialized component instance
     */
    public Spacer getSpacer1() {
        if (spacer1 == null) {
//GEN-END:|46-getter|0|46-preInit
 // write pre-init user code here
spacer1 = new Spacer(240, 1);//GEN-BEGIN:|46-getter|1|46-postInit
            spacer1.setPreferredSize(240, 15);//GEN-END:|46-getter|1|46-postInit
 // write post-init user code here
}//GEN-BEGIN:|46-getter|2|
        return spacer1;
    }
//</editor-fold>//GEN-END:|46-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: passField ">//GEN-BEGIN:|47-getter|0|47-preInit
    /**
     * Returns an initialized instance of passField component.
     *
     * @return the initialized component instance
     */
    public TextField getPassField() {
        if (passField == null) {
//GEN-END:|47-getter|0|47-preInit
 // write pre-init user code here
passField = new TextField("Mot de Passe", null, 32, TextField.ANY | TextField.PASSWORD | TextField.SENSITIVE);//GEN-LINE:|47-getter|1|47-postInit
 // write post-init user code here
}//GEN-BEGIN:|47-getter|2|
        return passField;
    }
//</editor-fold>//GEN-END:|47-getter|2|

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
