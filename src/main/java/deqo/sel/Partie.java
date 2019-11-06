package deqo.sel;

public class Partie {

    private int points;

    public Partie(int points){
        this.points = points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    /*public int sommePoints(Type_score type_score) {

        switch (type_score) {
            case STRIKE:
                ///////////
                break;
            case SPARE:
                /////////
                break;
            case NORMAL:
                /////////
                break;
            default:
                /////////
                break;
        }

    }*/
}
