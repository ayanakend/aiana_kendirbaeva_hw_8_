package kg.geektech.game.players;

public class Thor extends Hero{
    public Thor(int health, int damage,  String name) {
        super(health, damage, SuperAbility.STUN, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {


    }

}