package 익명클래스;
import java.awt.*;
import java.awt.event.*;

/*
class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent 발생!");
	}
}


class InnerEx7 {
	public static void main(String [] args) {
		Button b = new Button("Start!");
		b.addActionListener(new EventHandler());
	}
}
*/

/** 익명 클래스로 전환 */

class InnerEx8 {
	public static void main(String [] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent 발생!!");
				
			}
		});
	}
}