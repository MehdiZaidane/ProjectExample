import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Character {
    Random r = new Random();
    Enemy enemy;
    Item item;
    String name;
    int age, hp;
    int attack = r.nextInt(6)+1;
    ArrayList<Item> inventory = new ArrayList<>();

public Character(String n, int a, int h){
    this.name = n;
    this.age = a;
    this.hp = h;
}

public void setName(String newName){
    this.name = newName;

}
public void addItem(Item item){
    System.out.println("You have added a " + item.name + " in the inventory.");
    inventory.add(item);
}

public void removeItem(){
        System.out.println("You have removed a " + item + " in the inventory.");
        inventory.remove(item);
}


public void useKnife(){
    attack += 20;
    System.out.println("You are using the knife...You have now more attack.");
}

public void walk(){
    System.out.println("You are walking...");
}

public void sleep(){
    System.out.println(name + " is sleeping");
    System.out.println("Seems to be morning again");
}

public void read(Item item){
    System.out.println(name + " is reading the " + item.description);
}

public void hold(Item item){
        System.out.println(name + " is holding the " + item.name);
    }

public void attack(){
    System.out.println("You have attacked");
    enemy.hp -= attack;
    System.out.println("Enemy hp is " + enemy.hp);
}




@Override
    public String toString(){
    return "Name: " + name + "\nAge: " + age + "\nHealth: " + hp;
}


}


