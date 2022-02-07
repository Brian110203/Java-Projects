import java.util.*;

abstract class gameCharacter {
	double healthPoints = 0;
	double damagePower = 0;
	double monsterDamagePower = 0;
	String name = "";
	int currentLevel = 0;

	public double getHealthPoints() {
		  return healthPoints;
	}
	public void setHealthPoints(double healthPoints) {
		  this.healthPoints = healthPoints;
	 }
	
	public double getmonsterDamagePower() {
		  return damagePower;
	}
	public void setmonsterDamagePower(double monsterDamagePower) {
		  this.monsterDamagePower = monsterDamagePower;
	 }
	
	public double getDamagePower() {
		  return damagePower;
	}
	public void setdamagePower(double damagePower) {
		  this.damagePower = damagePower;
	 }
	
	public String getName() {
		  return name;
	}
	public void setName(String name) {
		  this.name = name;
	 }
	
	public int currentLevel() {
		  return currentLevel;
	}
	  public void setCurrentLevel(int currentLevel) {
		    this.currentLevel = currentLevel;
	 }
}


class player extends gameCharacter {
	private int experienceUntilNextLevel;
	private int experienceEarned;

	public player(String name, int healthPoints, double damagePower, int experienceEarned, int experienceUntilNextLevel) {
		this.name = name;
		this.healthPoints = 50 + (int)(Math.random() * ((200 - 50) + 1));
		this.damagePower = 10 + (int)(Math.random() * ((50 - 10) + 1));
		this.setExperienceEarned(experienceEarned);
		this.setExperienceUntilNextLevel(experienceUntilNextLevel);
	}
	
	public double attack() {
		double playerAttack = damagePower;
		return playerAttack;
	}
	
	public void takeDamage() {
		healthPoints = healthPoints - monsterDamagePower;
	}
	
	public String toString(){
		  return name+" "+healthPoints+" "+experienceEarned+" "+experienceUntilNextLevel;  
		 }  
	

	public int getExperienceUntilNextLevel() {
		return experienceUntilNextLevel;
	}

	public void setExperienceUntilNextLevel(int experienceUntilNextLevel) {
		this.experienceUntilNextLevel = experienceUntilNextLevel;
	}

	public int getExperienceEarned() {
		return experienceEarned;
	}

	public void setExperienceEarned(int experienceEarned) {
		this.experienceEarned = experienceEarned;
	}
	
}


class monster extends gameCharacter {
	public int experienceWorth;

	public monster(String name, int healthPoints, double monsterDamagePower, int experienceWorth) {
		this.name = name;
		this.healthPoints = 50 + (int)(Math.random() * ((200 - 50) + 1));
		this.monsterDamagePower = 10 + (int)(Math.random() * ((50 - 10) + 1));
		this.experienceWorth = 10 + (int)(Math.random() * ((40 - 10) + 1));
	}
	
	public double attack() {
		double monsterAttack = damagePower;
		return monsterAttack;
	}
	
	public void takeDamage() {
		healthPoints = healthPoints - damagePower;
	}
	
	public String toString(){
		  return name+" "+healthPoints+" "+experienceWorth;  
		 }  
	
	public int getexperienceWorth() {
		return experienceWorth;
	}

	public void setexperienceWorth(int experienceWorth) {
		this.experienceWorth = experienceWorth;
	}
}

public class Game {
	public static void main(String[] args) {
		player p1=new player("Player 1", 0, 0, 0, 50); 
		monster m1=new monster("Monster 1", 0, 0, 0);
		
		System.out.println("==========Player Stats==========" + "\nPlayer Name: " + p1.name + "\nHealth Points: " + p1.healthPoints + "\nDamage Power: " + p1.damagePower + "\nExperience: " + p1.getExperienceEarned() + "\nExperience Until Next Level: " + p1.getExperienceUntilNextLevel() + "\n");
		System.out.println("\n==========Monster Stats==========" + "\nMonster Name: " + m1.name + "\nHealth Points: " + m1.healthPoints + "\nDamage Power: " + m1.monsterDamagePower + "\nExperience Worth: " + m1.experienceWorth);
		
		while (p1.healthPoints > 0) {
			while (m1.healthPoints > 0) {
				System.out.println("\nTo Attack Enter: 1");
				Scanner input = new Scanner(System.in);
		        int attack = input.nextInt();
		        if (attack == 1) {
		        	p1.attack();
		        	m1.attack();
					p1.healthPoints = p1.healthPoints - m1.monsterDamagePower; //p1.takeDamage() Method won't work despite doing same thing
					m1.healthPoints = m1.healthPoints - p1.damagePower; //m1.takeDamage() Method won't work despite doing same thing
					
					if(p1.healthPoints <= 0) {
						p1.healthPoints = 0;
					}
					if(m1.healthPoints <= 0) {
						m1.healthPoints = 0;
					}
					
					System.out.println("\nYou Hit the Monster for: " + p1.damagePower + " Damage.");
					System.out.println("Its Remaining Health is: " + m1.healthPoints);
					
					System.out.println("\nThe Monster Hit You for: " + m1.monsterDamagePower + " Damage.");
					System.out.println("Your Remaining Health is: " + p1.healthPoints);
					
					p1.damagePower = 10 + (int)(Math.random() * ((50 - 10) + 1));
					m1.monsterDamagePower = 10 + (int)(Math.random() * ((50 - 10) + 1));
					
					if(p1.healthPoints > 0) {
						if(m1.healthPoints <= 0) {
							p1.setExperienceEarned(m1.experienceWorth);
							p1.setExperienceUntilNextLevel(p1.getExperienceUntilNextLevel() - p1.getExperienceEarned());
						}
					}
					
		    		if(p1.healthPoints <= 0) {
		    			System.out.println("\nYou Lose!");
		    			break;
		    		}
		    		if(m1.healthPoints <= 0) {
		    			System.out.println("\nYou Win!");
		    			System.out.println("Experience Earned: " + p1.getExperienceEarned());
		    			System.out.println("Experience Until Next Level: " + p1.getExperienceUntilNextLevel());
	    				break;
		    		}
		        }
			}
		}
	    
}
}
