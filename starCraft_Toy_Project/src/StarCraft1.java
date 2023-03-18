import javax.lang.model.type.UnionType;

public class StarCraft1 {
    public static void main(String[] args) {

    }
}

interface Unit {
    public String useSkill();
    // 스팀팩, 힐, 리페어, 시즈모드(true,false)
    public String getName();
    public int setDamage();
    public int getHP();
}

interface Buildings {
    public int getHP();
    public void useSkill();
    // drop();
}
