/**
 *
 */
package jp.co.home.common;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

import jp.co.home.ActionListener.ActionButton;

/**
 * @author HIROAKI
 *
 */
public class AWTMain extends Frame{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new AWTMain();


	}

	public AWTMain() {
		super("AWT Main");
		setSize(1000, 500);
		setLayout(new FlowLayout());
		Button b1 = new Button("Button");
		b1.setSize(100, 100);
		b1.addActionListener(new ActionButton());
		add(b1);
		//show();
		setVisible(true);
	}

}
