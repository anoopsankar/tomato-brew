package in.rusty.tomatobrew.models;

public class Cast {

    private String id;
    private String name;
    private String[] characters;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String[] getCharacters() {
        return characters;
    }
    public void setCharacters(String[] characters) {
        this.characters = characters;
    }
    
}
