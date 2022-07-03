package Attack;

public class FighterPhysicalAttack extends PhysicalAttack {
    @Override
    int singleAttackDamage() {
        return super.singleAttackDamage() + 20;
    }

    @Override
    int dobleAttackDamage() {
        return super.dobleAttackDamage() + 10;
    }
}
