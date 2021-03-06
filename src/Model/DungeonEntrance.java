package Model;

/**
 * Fills fields specific to dungeon entrance/exits
 * @author Wes Rodgers
 *
 */
public class DungeonEntrance extends Obstacle{
	private static final long serialVersionUID = 1L;

	public DungeonEntrance(int x, int y) {
		destructible = false;
		width = 48;
		height = 52;
		location = new int[2];
		location[0] = x;
		location[1] = y;
		topImage = false;
		topHeight = 0;
	}
}
