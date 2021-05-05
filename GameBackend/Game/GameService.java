
public interface GameService {

	public void add(Game game);
	public void delete(Game game);
	public void upgrade(Game game,String name, double price);
	public void sellGame(Game game, Customer customer);
	public void campaingSellGame(Game game, Customer customer , Campaign campaign);
	
}
