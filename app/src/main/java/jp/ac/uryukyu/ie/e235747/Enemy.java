package jp.ac.uryukyu.ie.e235747;

/**
 * 敵クラス。
 */
public class Enemy extends LivingThing {

    public Enemy(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage) {
        super.wounded(damage);
        if (dead) {
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

    public String getName(){
        return this.name;
    }
    public void setName(String _name){
        this.name = _name;
    }
    public int getHitPoint(){
        return this.hitPoint;
    }
    public void setHitPoint(int _hitPoint){
        this.hitPoint = _hitPoint;
    }
    public int getAttack(){
        return this.attack;
    }
    public void setAttack(int _attack){
        this.attack = _attack;
    }
    public boolean getDead(){
        return this.dead;
    }
    public void setDead(boolean _dead){
        this.dead = _dead;
    }
}
