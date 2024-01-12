/**
 * petani
 */

  public class Player {

    String name;
    int speed, damage, armor, healthPoint, energy;

    Player(String name, int damage, int speed, int armor, int healthPoint, int energy) {
      this.name = name;
      this.damage = damage;
      this.speed = speed;
      this.armor = armor;
      this.healthPoint = healthPoint;
      this.energy = energy;
    }

    void run() {
      System.out.println(this.name + " is runnning");
      speed++;
      energy--;
      System.out.println("ENERGY : " + energy + "\nSPEED : " + speed);
    }
        
    void attack(Player Enemy) {
      System.out.println(this.name + " Attack " + Enemy.name);
      
      defend(Enemy);
    }
    
   private void defend(Player Enemy) {
      System.out.println("\n" + this.name + " Attack " + this.damage + " damage and " + Enemy.name + " parry with "
          + Enemy.armor + " defends power");

      if (this.damage > Enemy.armor)
        Enemy.healthPoint -= (this.damage - Enemy.armor);

      Enemy.energy--;
      this.energy--;

      System.out.println(Enemy.name + ": \n" + "HEALTH : " + Enemy.healthPoint + "\nENERGY : " + Enemy.energy);
      System.out.println(this.name + ": \n" + "HEALTH : " + this.healthPoint + "\nENERGY : " + this.energy);
      isDeadth(Enemy);
    } 

    private void isDeadth(Player Enemy) {
      if (Enemy.healthPoint <= 0)
        System.out.println(Enemy.name + " Dieee " + " || " + this.name + " Winner ");
     
    }
  }

