package JavaOOP.Encapsulation.FootballTeam;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    private void setShooting(int shooting) {
        if (!isValid(shooting)) {
            throw new IllegalArgumentException("Endurance should be between 0 and 100");
        }
        this.shooting = shooting;
    }

    private void setPassing(int passing) {
        if (!isValid(passing)) {
            throw new IllegalArgumentException("Endurance should be between 0 and 100");
        }
        this.passing = passing;
    }

    private void setDribble(int dribble) {
        if (!isValid(dribble)) {
            throw new IllegalArgumentException("Endurance should be between 0 and 100");
        }
        this.dribble = dribble;
    }

    private void setSprint(int sprint) {
        if (!isValid(sprint)) {
            throw new IllegalArgumentException("Endurance should be between 0 and 100");
        }
        this.sprint = sprint;
    }


    private void setEndurance(int endurance) {
        if (!isValid(endurance)) {
            throw new IllegalArgumentException("Endurance should be between 0 and 100");
        }
        this.endurance = endurance;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty");
        }
        this.name = name;
    }

    public double overallSkillLevel() {
       return (endurance + sprint + dribble + passing + shooting) / 5.00;
    }

    private boolean isValid(int stats) {
        return stats > 0 && stats < 100;
    }
 public String getName(){
        return this.name;
 }
}
