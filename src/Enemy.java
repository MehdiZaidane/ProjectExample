public class Enemy {
    String name, type;
    int hp, attack;

    public Enemy(String n, String t, int h, int a){
        this.name = n;
        this.type = t;
        this.hp = h;
        this.attack = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(int health) {
        this.hp = health;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }


@Override
    public String toString(){
        return "Name: " + name + "\nType: " + type + "\nHealth: " + hp + "\nAttack: " + attack ;
}


}
