/**
 * 
 */
package exceptionsGame.game;

/**
 * @author noize
 *
 */
public class Mage extends Character {

	protected String RPGClass = "Mage";
	protected int life = 70;
	protected int strength = 3;
	protected int agility = 10;
	protected int wit = 10;
	
	public Mage(String name)
	{
		this.name = name;
		System.out.println(this.name + " : May the gods be with me.");
	}
	
	public void attack(String weapon) throws WeaponException{
		if(weapon == "magic" || weapon == "wand") {
			String res = this.name + " : Rrrrrrrrr...." + "\n";
			res += this.name + " : "+ "Feel the power of my " + weapon + " !";
			System.out.println(res);
		}
		else if (weapon == ""){
			throw new WeaponException(this.name + " : I refuse to fight with my bare hands.");
		}
		else {
			throw new WeaponException(this.name + " : I don't need this stupid " + weapon + " ! Don't misjudge my powers !");
		}
	}
	
	public void tryToAttack(String weapon) {
		try {
			this.attack(weapon);
		} catch (WeaponException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void moveRight() {
		System.out.println(this.name + " : moves right furtively.");
	}
	
	public void moveLeft() {
		System.out.println(this.name + " : moves left furtively.");
	}
	
	public void moveForward() {
		System.out.println(this.name + " : moves forward furtively.");
	}
	
	public void moveBack() {
		System.out.println(this.name + " : moves back furtively.");
	}
}