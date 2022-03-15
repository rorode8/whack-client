package whack_client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ClickListener implements ActionListener{
	
	private int coordinate;
	private JButton btn;
	

	public ClickListener(int coordinate, JButton btn) {
		super();
		this.btn = btn;
		this.coordinate = coordinate;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		btn.setIcon(null);
		System.out.println(this.coordinate);
	}

}
