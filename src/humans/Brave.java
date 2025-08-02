package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	public Brave(String name, String weapon) {
		super(name, weapon);
		hp = Dice.get(170, 230);
		offensive = Dice.get(7, 13);
	}
}
