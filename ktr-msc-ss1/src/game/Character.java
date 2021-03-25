package game;
/**
 * 
 */

/**
 * @author noize
 *
 */
public abstract class Character implements Movable{

	protected String name;
	protected static String RPGClass;
	protected int life = 50;
	protected int agility = 2;
	protected int strength = 2;
	protected int wit = 2;	
	
	public String getName()
	{
		return this.name;
	}
	
	public String getRPGClass()
	{
		return this.RPGClass;
	}
	
	public int getLife()
	{
		return this.life;
	}
	
	public int getAgility()
	{
		return this.agility;
	}
	
	public int getStrength()
	{
		return this.strength;
	}
	
	public int getWit()
	{
		return this.wit;
	}
	
	public void attack(String str)
	{
		String res = "";
		
		res += this.name + " : Rrrrrrrrr....";
		
		System.out.println(res);
	}
	
	public void moveRight() {
		System.out.println(this.name + " : moves right");
	}
	
	public void moveLeft() {
		System.out.println(this.name + " : moves left");
	}
	
	public void moveForward() {
		System.out.println(this.name + " : moves forward");
	}
	
	public void moveBack() {
		System.out.println(this.name + " : moves back");
	}
	
	public void unsheathe() {
		System.out.println(this.name + " : unsheathes his weapon.");
	}
}