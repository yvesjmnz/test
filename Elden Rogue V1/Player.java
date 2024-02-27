public class Player {
    private String name;
    private String jobClass;
    private int level;
    private int runes;
    private int hp;
    private int endurance;
    private int dexterity;
    private int strength;
    private int intelligence;
    private int faith;

    //area markers
    private boolean clearedArea1;

    public Player(String name, String jobClass) {
        this.name = name;
        this.jobClass = jobClass;
        this.level = 1;
        this.runes = 0;
        this.clearedArea1 = false;

        // Initialize additional stats based on job class
        switch (jobClass) {
            case "VAGABOND":
                this.hp = 15;
                this.endurance = 11;
                this.dexterity = 13;
                this.strength = 14;
                this.intelligence = 9;
                this.faith = 9;
                break;
            case "SAMURAI":
                this.hp = 12;
                this.endurance = 13;
                this.dexterity = 15;
                this.strength = 12;
                this.intelligence = 9;
                this.faith = 8;
                break;
            case "WARRIOR":
                this.hp = 11;
                this.endurance = 11;
                this.dexterity = 16;
                this.strength = 10;
                this.intelligence = 10;
                this.faith = 8;
                break;
            case "HERO":
                this.hp = 14;
                this.endurance = 12;
                this.dexterity = 9;
                this.strength = 16;
                this.intelligence = 7;
                this.faith = 8;
                break;
            case "ASTROLOGER":
                this.hp = 9;
                this.endurance = 9;
                this.dexterity = 12;
                this.strength = 8;
                this.intelligence = 16;
                this.faith = 7;
                break;
            case "PROPHET":
                this.hp = 10;
                this.endurance = 8;
                this.dexterity = 10;
                this.strength = 11;
                this.intelligence = 7;
                this.faith = 16;
                break;
            default:
                // Default stats if job class is unknown
                this.hp = 10;
                this.endurance = 10;
                this.dexterity = 10;
                this.strength = 10;
                this.intelligence = 10;
                this.faith = 10;
        }
    }

    // Getters for additional stats
    public int getHP() {
        return hp;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getFaith() {
        return faith;
    }

    // Getters and setters for other attributes
    public String getName() {
        return name;
    }

    public String getJobClass() {
        return jobClass;
    }

    public int getLevel() {
        return level;
    }

    public int getRunes() {
        return runes;
    }

    public void setRunes(int runes) {
        this.runes = runes;
    }


    public void levelUp() {
        level++;
    }

    public boolean isClearedArea1() {
        return clearedArea1;
    }
}
