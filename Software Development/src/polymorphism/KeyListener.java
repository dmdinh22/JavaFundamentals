package polymorphism;

import java.awt.event.KeyEvent;

// interface declares methods but does not supply bodies for them
public interface KeyListener {
	public void keyPressed(KeyEvent e);
	public void keyReleased(KeyEvent e);
	public void keyTyped(KeyEvent e);
}

// all interface methods are implicitly public and abstract
// you cannot instantiate an interface
	// interface is like a very abstract class - none of its methods are defined
// interface may also contain constants (final vars)