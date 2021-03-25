package game;
/**
 * 
 */

import game.*;

/**
 * @author noize
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		Character warrior = new Warrior("Jean-Luc");
		Character mage = new Mage("Robert");
		
		warrior.attack("hammer");
		mage.attack("magic");
		
		warrior.moveRight();
		warrior.moveLeft();
		warrior.moveForward();
		warrior.moveBack();
		
		mage.moveRight();
		mage.moveLeft();
		mage.moveForward();
		mage.moveBack();
		
		mage.unsheathe();
	}
}
