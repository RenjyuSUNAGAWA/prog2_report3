package jp.ac.uryukyu.ie.e235747;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void AttackWithWeponSkillTest(){
        Warrior warrior = new Warrior("戦士", 100, 20);
        Enemy enemy = new Enemy("敵", 80, 15);

        for(int i=0; i<3; i++){
            warrior.attackWithWeponSkill(enemy);
        }
        int expectedDamage = (int)(1.5 * warrior.getAttack());
        assertEquals(80 - 3 * expectedDamage, enemy.getHitPoint());
    }
}
