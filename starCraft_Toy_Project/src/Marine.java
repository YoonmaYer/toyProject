public class Marine extends TerranUnit{
    private String Skill;
    private String Name;

    public Marine() {
        super.HP(50);
        super.Damage(6);
        this.Name = "Marine";
        this.Skill = "Stim Pack";
    }
    public int getHP() {
        return HP;
    }
    public int setDamage() {
        return Damage;
    }


}
