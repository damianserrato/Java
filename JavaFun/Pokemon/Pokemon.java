public class Pokemon {

    private String name;
    private int health;
    private String type;

    public static int count = 0;

    public Pokemon(String name, int health, String type) {
        this.name = name;
        this.health = health;
        this.type = type;
        this.count ++;
    }

    public String getName() {
        return this.name;
    }
    public Pokemon setName() {
        this.name = name;
        return this;
    }

    public int getHealth() {
        return this.health;
    }
    public Pokemon setHealth() {
        this.health = health;
        return this;
    }

    public String getType() {
        return this.type;
    }
    public Pokemon setType() {
        this.type = type;
        return this;
    }

    
}
