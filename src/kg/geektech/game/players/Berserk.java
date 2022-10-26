package kg.geektech.game.players;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        setSavedDamage(30);
        boss.setHealth(boss.getHealth()-(savedDamage+ this.getDamage()));
        System.out.println("Berserk's saved and reverted damage:"+(savedDamage+this.getDamage()));

    }


    public void setSavedDamage(int savedDamage) {

        this.savedDamage = savedDamage;



    }

}