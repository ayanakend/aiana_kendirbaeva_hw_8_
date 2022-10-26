package kg.geektech.game.players;

public abstract class Hero extends kg.geektech.game.players.GameEntity
        implements HavingSuperAbility {
    private kg.geektech.game.players.SuperAbility ability;

    public Hero(int health, int damage, kg.geektech.game.players.SuperAbility ability, String name) {
        super(health, damage, name);
        this.ability = ability;
    }

    public void hit(Boss boss) {
        boss.setHealth(boss.getHealth() - this.getDamage());
    }

    public kg.geektech.game.players.SuperAbility getAbility() {
        return ability;
    }
}