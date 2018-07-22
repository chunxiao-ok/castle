package castle;

public class HandlerGo extends Handler{

	@Override
	public void doCmd(String word) {
		// TODO Auto-generated method stub
	//	super.doCmd(word);
		game.goRoom(word);
	}

	public HandlerGo(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

}
