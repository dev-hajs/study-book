package _08_shotgun_surgery;

public class Rating {

    public int rating(Driver driver) {
        // inline function(method)
        return driver.getNumberOfLateDeliveries() > 5 ? 2 : 1;
    }

}
