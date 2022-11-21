package tiktok;

public class Idol {
    public static int IDOL_ID = 1000;

    private final int id;
    private String name;
    private String email;
    private Follower follower;
    private String group;

    public Idol() {
        this.id = IDOL_ID;
        IDOL_ID++;
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

    public Follower getFollower() {
        return follower;
    }

    public void setFollower(Follower follower) {
        this.follower = follower;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", follower=" + follower +
                ", group='" + group + '\'' +
                '}';
    }
}
