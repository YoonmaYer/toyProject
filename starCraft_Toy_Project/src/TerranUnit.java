public abstract class TerranUnit implements Unit {
    protected int HP;
    protected int Damage;
    private String Skill;
    private String Name;

    public TerranUnit(int HP, int Damage, String Skill, String Name) {
        this.HP = HP;
        this.Damage = Damage;
        this.Skill = Skill;
        this.Name = Name;
    }

    public int getHP() {
        return HP;
    }

    public int getDamage() {
        return Damage;
    }

    public abstract String useSkill();


    public abstract String getName();

}

