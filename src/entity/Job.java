package entity;

public class Job {
    private static int idAuto =100;
    private int id;
    private String name;
    private double reward;

    public Job() {
        this.id = idAuto++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }
}
