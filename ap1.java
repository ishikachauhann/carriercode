import java.applet.Applet;
import java.awt.Graphics;

public
 
class
 
HelloWorld
 
extends
 
Applet
 
{
    @Override

    
public
 
void
 
paint(Graphics g)
 
{
        g.drawString("Hello World!", 50, 25);
    }
}
/*<applet code="HelloWorld.class" width="400" height="200"></applet>*/