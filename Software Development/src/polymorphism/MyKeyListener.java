package polymorphism;

import java.awt.event.KeyEvent;

// define some but not all methods defined in interface w/ abstract class
public abstract class MyKeyListener implements KeyListener {
	public void keyTyped(KeyEvent e) {
		
	};
}

// can extend an interface to add methods
interface FunkyKeyListener extends KeyListener {
	// added methods here
}