package observer.observerReal;

// There are many event like Rain, Player get injured etc.
// But for now let's only focus on new delivery as an event
public class MatchEvent {
    private int over;
    private int delivery;
    private int bat1Score;
    private int bat2Score;
    private String bowlerName;

    // todo: Add all other properties.

    public MatchEvent(int over, int delivery, int bat1Score, int bat2Score, String bowlerName) {
        this.over = over;
        this.delivery = delivery;
        this.bat1Score = bat1Score;
        this.bat2Score = bat2Score;
        this.bowlerName = bowlerName;
    }

    // Creating getters
    public int getOver() {
        return over;
    }

    public int getDelivery() {
        return delivery;
    }

    public int getBat1Score() {
        return bat1Score;
    }

    public int getBat2Score() {
        return bat2Score;
    }

    public String getBowlerName() {
        return bowlerName;
    }

}
