import java.util.ArrayList;

public class Area {
    String name, description;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return  name + ". Description of the area: " + description;
    }

}
