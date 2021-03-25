/**
 * 
 */
package game;

/**
 * @author noize
 *
 */
public class Warrior extends Character {

	protected String RPGClass = "Warrior";
	protected int life = 100;
	protected int strength = 10;
	protected int agility = 8;
	protected int wit = 3;
	
	public Warrior(String name)
	{
		this.name = name;
		System.out.println(this.name + " : My name will go down in history !");
	}
	
	public void attack(String weapon){
		if(weapon == "hammer" || weapon == "sword") {
			String res = this.name + " : Rrrrrrrrr...." + "\n";
			res += this.name + " : " + "I'll crush you with my " + weapon + " !";
			System.out.println(res);
		}
	}
	
	public void moveRight() {
		System.out.println(this.name + " : moves right like a bad boy.");
	}
	
	public void moveLeft() {
		System.out.println(this.name + " : moves left like a bad boy.");
	}
	
	public void moveForward() {
		System.out.println(this.name + " : moves forward like a bad boy.");
	}
	
	public void moveBack() {
		System.out.println(this.name + " : moves back like a bad boy.");
	}
}
