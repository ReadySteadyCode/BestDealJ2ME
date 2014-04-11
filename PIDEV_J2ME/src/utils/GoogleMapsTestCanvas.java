package utils;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.List;
import javax.microedition.midlet.MIDlet;

abstract public class GoogleMapsTestCanvas extends Canvas { 

	
	
	Displayable testListScreen;
	MIDlet midlet;
	
	public GoogleMapsTestCanvas(MIDlet m, Displayable testListScreen)
	{
		this.midlet = m;
		this.testListScreen = testListScreen;
		
	}
	
	
	void showError(String message)
	{
		Alert error = new Alert("Error", message, null, AlertType.ERROR);
		
		Display.getDisplay(midlet).setCurrent(error, this);
	}
}
