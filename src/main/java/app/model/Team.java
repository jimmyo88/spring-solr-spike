package app.model;


public class Team {

    private String positionNumber;
    private String teamName;
    private String played;
    private String goalDifference;
    private String points;

    public Team(String positionNumber, String teamName, String played, String goalDifference, String points) {
        this.positionNumber = positionNumber;
        this.teamName = teamName;
        this.played = played;
        this.goalDifference = goalDifference;
        this.points = points;
    }

    public String getPositionNumber() {
        return positionNumber;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getPlayed() {
        return played;
    }

    public String getGoalDifference() {
        return goalDifference;
    }

    public String getPoints() {
        return points;
    }

    public void setPositionNumber(String positionNumber) {
        this.positionNumber = positionNumber;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setPlayed(String played) {
        this.played = played;
    }

    public void setGoalDifference(String goalDifference) {
        this.goalDifference = goalDifference;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Team{" +
                "positionNumber='" + positionNumber + '\'' +
                ", teamName='" + teamName + '\'' +
                ", played='" + played + '\'' +
                ", goalDifference='" + goalDifference + '\'' +
                ", points='" + points + '\'' +
                '}';
    }
}
