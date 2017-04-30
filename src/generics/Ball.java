package generics;

/**
 * Created by siddhahastmohapatra on 08/03/17.
 */
public class Ball implements Item {

    String ballType;
    String match;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        return ballType != null ? ballType.equals(ball.ballType) : ball.ballType == null;
    }

    @Override
    public int hashCode() {
        return ballType != null ? ballType.hashCode() : 0;
    }

    public Ball(String ballType){
        this.ballType = ballType;
    }

    @Override
    public String getItemType() {
        return ballType;
    }

    @Override
    public String getMatchType() {
        return match;
    }


}
