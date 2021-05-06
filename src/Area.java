import java.util.ArrayList;

public class Area {
    String name, description;
    Item item;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return  name + ". Area description: " + description;
    }

}
