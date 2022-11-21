package tiktok;

public class Follower {
    public static int FOLLOWER_ID = 100;

    private final int id;
    private String name;
    private String email;

    private int numberOfLike;

    public Follower() {
        this.id = FOLLOWER_ID;
        FOLLOWER_ID++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}
