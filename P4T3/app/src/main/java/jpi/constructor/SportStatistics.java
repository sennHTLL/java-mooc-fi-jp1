package jpi.constructor;

public class SportStatistics {

    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public SportStatistics(String hT, String vT, int hTP, int vTP) {
        this.homeTeam = hT;
        this.visitingTeam = vT;
        this.homeTeamPoints = hTP;
        this.visitingTeamPoints = vTP;
    }

    public String getHomeTeam() {
        return homeTeam;
    }
    
    public String getVisitingTeam() {
        return visitingTeam;
    }
    
    public int getHomeTeamPoints() {
        return homeTeamPoints;
    }
    
    public int getVisitingTeamPoints() {
        return visitingTeamPoints;
    }
}
