package whack_client.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import whack_client.Game;

public class SubmitListener implements ActionListener {
	
	private Game game;
	

	public SubmitListener(Game game) {
		super();
		this.game = game;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		game.loadMenu();

	}

}
