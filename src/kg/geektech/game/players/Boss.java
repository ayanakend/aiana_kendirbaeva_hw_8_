package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Boss extends kg.geektech.game.players.GameEntity {
    private SuperAbility defence;
    private boolean canCauseDamage;

    public Boss(int health, int damage, String name) {
        super(health, damage, name);
    }

    public void hit(Hero[] heroes) {

        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() - this.getDamage());

            }
        }
    }




    public void chooseDefence(Hero[] heroes) {
        int randomIndex = RPG_Game.random.nextInt(heroes.length);
        this.defence = heroes[randomIndex].getAbility();
    }

    public SuperAbility getDefence() {
        return defence;
    }

    @Override
    public String toString() {
        return "BOSS " + super.toString() + " Defence: " +
                (this.getDefence() == null ? "No defence" : this.getDefence());
    }

    public boolean isCanCauseDamage() {
        return canCauseDamage;
    }

    public void setCanCauseDamage(boolean canCauseDamage) {
        this.canCauseDamage = canCauseDamage;
    }


}