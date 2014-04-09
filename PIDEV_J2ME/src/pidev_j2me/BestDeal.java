/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pidev_j2me;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import org.netbeans.microedition.lcdui.SplashScreen;

/**
 * @author Internet
 */
public class BestDeal extends MIDlet implements CommandListener {
    
    private boolean midletPaused = false;

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private SplashScreen splashScreen;
    private Form InternauteDeals;
    private Form LoginForm;
    private Spacer spacer;
    private TextField textField;
    private Spacer spacer1;
    private TextField textField1;
    private Alert alert;
    private CanvasList canvasList;
    private Command exitCommand;
    private Command okCommand;
    private Command backCommand;
    private Command okCommand1;
    private Command backCommand1;
    private Image image1;
//</editor-fold>//GEN-END:|fields|0|
    /**
     * The BestDeal constructor.
     */
    public BestDeal() {
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
if (displayable == InternauteDeals) {//GEN-BEGIN:|7-commandAction|1|22-preAction
            if (command == exitCommand) {//GEN-END:|7-commandAction|1|22-preAction
 // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|2|22-postAction
 // write post-action user code here
} else if (command == okCommand) {//GEN-LINE:|7-commandAction|3|24-preAction
 // write pre-action user code here
switchDisplayable(null, getLoginForm());//GEN-LINE:|7-commandAction|4|24-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|5|32-preAction
} else if (displayable == LoginForm) {
    if (command == backCommand) {//GEN-END:|7-commandAction|5|32-preAction
 // write pre-action user code here
switchDisplayable(null, getInternauteDeals());//GEN-LINE:|7-commandAction|6|32-postAction
 // write post-action user code here
} else if (command == okCommand1) {//GEN-LINE:|7-commandAction|7|35-preAction
 // write pre-action user code here
LoginMethod();//GEN-LINE:|7-commandAction|8|35-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|9|45-preAction
} else if (displayable == alert) {
    if (command == backCommand1) {//GEN-END:|7-commandAction|9|45-preAction
 // write pre-action user code here
switchDisplayable(null, getLoginForm());//GEN-LINE:|7-commandAction|10|45-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|11|16-preAction
} else if (displayable == splashScreen) {
    if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|11|16-preAction
 // write pre-action user code here
switchDisplayable(null, getInternauteDeals());//GEN-LINE:|7-commandAction|12|16-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|13|7-postCommandAction
        }//GEN-END:|7-commandAction|13|7-postCommandAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|14|
//</editor-fold>//GEN-END:|7-commandAction|14|

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
    e.printStackTrace();}//GEN-LINE:|18-getter|2|18-postInit
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
LoginForm = new Form("form", new Item[]{getSpacer(), getTextField(), getSpacer1(), getTextField1()});//GEN-BEGIN:|26-getter|1|26-postInit
            LoginForm.addCommand(getBackCommand());
            LoginForm.addCommand(getOkCommand1());
            LoginForm.setCommandListener(this);//GEN-END:|26-getter|1|26-postInit
 // write post-init user code here
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

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|28-getter|0|28-preInit
    /**
     * Returns an initialized instance of textField component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {
//GEN-END:|28-getter|0|28-preInit
 // write pre-init user code here
textField = new TextField("E-mail", null, 32, TextField.EMAILADDR);//GEN-LINE:|28-getter|1|28-postInit
 // write post-init user code here
}//GEN-BEGIN:|28-getter|2|
        return textField;
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

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField1 ">//GEN-BEGIN:|30-getter|0|30-preInit
    /**
     * Returns an initialized instance of textField1 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField1() {
        if (textField1 == null) {
//GEN-END:|30-getter|0|30-preInit
 // write pre-init user code here
textField1 = new TextField("Mot de Passe", null, 32, TextField.ANY | TextField.PASSWORD | TextField.SENSITIVE);//GEN-LINE:|30-getter|1|30-postInit
 // write post-init user code here
}//GEN-BEGIN:|30-getter|2|
        return textField1;
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
 // enter pre-if user code here
if (true) {//GEN-LINE:|38-if|1|39-preAction
 // write pre-action user code here
switchDisplayable(null, getCanvasList());//GEN-LINE:|38-if|2|39-postAction
 // write post-action user code here
} else {//GEN-LINE:|38-if|3|40-preAction
 // write pre-action user code here
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
        if (canvasList == null) {//GEN-END:|47-getter|0|47-preInit
 // write pre-init user code here
canvasList = new CanvasList(null, null, null);//GEN-BEGIN:|47-getter|1|47-postInit
            canvasList.setTitle("canvasList");
            canvasList.setFullScreenMode(true);//GEN-END:|47-getter|1|47-postInit
  
}//GEN-BEGIN:|47-getter|2|
        return canvasList;
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
    
}
