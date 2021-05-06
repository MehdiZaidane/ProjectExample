import java.util.ArrayList;
import java.util.Scanner;

    public class Game {
        Character character;
        Area area;
        Item item;
        Enemy enemy;
        Scanner sc = new Scanner(System.in);
        Character gameCharacter = new Character("empty", 25,500);
        ArrayList<String> list = new ArrayList<>();

        Area areaGame = new Area();
        Item itemGame = new Item();
        Enemy enemyGame = new Enemy("","",0 ,0);



        public Game(){ }

        public void startGame(){
            System.out.println("Welcome, enter a name for your character:");
            String characterName = sc.nextLine();
            gameCharacter.setName(characterName);
            System.out.println("Your character stats: \n" + gameCharacter.toString());
            System.out.println("");
            setLevel();
            stageOne();

        }


        public void setLevel(){
            System.out.println("Set level: \nType: Easy, Normal or Hard.");
            String level = sc.nextLine();
            switch (level){
                case "Easy":
                    System.out.println("You selected Easy Mode!");
                    enemyGame.setAttack(10);
                    enemyGame.setHp(100);
                break;
                case "Normal":
                    System.out.println("You selected Normal Mode!");
                    enemyGame.setAttack(20);
                    enemyGame.setHp(200);
                    break;
                case "Hard":
                    System.out.println("You selected Hard Mode!");
                    enemyGame.setAttack(40);
                    enemyGame.setHp(400);
                    break;
                default:
                    System.out.println("--------------------Enter a valid number!-------------------");
                    setLevel();
            }
        }

        public void stageOne(){
            list.add("Inspect area");
            list.add("Sleep");
            itemGame.setDescription("Big sharp knife. Gives you 20 attack");
            itemGame.setName("Knife");
            areaGame.setDescription("You are in a big jungle with much trees");
            areaGame.setName("Jungle");
            enemyGame.setName("Zombie");
            System.out.println("You have appeared in: " + areaGame.toString());
            action();
            list.add("Hold item");
            list.add("Pick item");
            list.add("Walk");
            action();
            list.add("Use knife");
            System.out.println("You need to kill the " + enemyGame.getName() + " to move forward.");
            list.add("Attack");
            list.add("Read item");
            action();

        }


        public void action(){
            System.out.println("What do you want to do? Type (Actions) for help.");
            String movement = sc.nextLine();
            switch (movement){
                case "Actions":
                    System.out.println(list);
                    action();
                    break;
                case "Inspect area":
                    System.out.println("You are inspecting the area...");
                    System.out.println("You found a " + itemGame.getName() + ". Do you want to pick it?. There is a " + enemyGame.getName() + " near. ");
                    break;
                case "Walk":
                    gameCharacter.walk();
                    break;
                case "Pick item":
                    gameCharacter.addItem(itemGame);
                    break;
                case "Sleep":
                    gameCharacter.sleep();
                    break;
                case "Read item":
                    gameCharacter.read(itemGame);
                    break;
                case "Hold item":
                    gameCharacter.hold(itemGame);
                    break;
                case "Use knife":
                    gameCharacter.useKnife();
                   break;
                case "Attack":
                    gameCharacter.attack();
                    break;
            }
        }




    }





