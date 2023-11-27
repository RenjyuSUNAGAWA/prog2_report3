package jp.ac.uryukyu.ie.e235747;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {

    public Hero(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage) {
        super.wounded(damage);
        if (dead) {
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
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