public class Item {
    String name, description;

    public void setName (String newName) {
        this.name = newName;
    }

    public void setDescription (String newDescription) {
        this.description = newDescription;
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }


    @Override
    public String toString(){
        return "Item name: " + name + "\nItem description: " + description;
}
}
