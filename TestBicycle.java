

class MountainBike extends  Bicycle {
    public int seatHeight;

    public MountainBike(int gear, int speed,
                        int startHeight)
    {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
        @Override public String toString()
        {
            return (super.toString() + "\nseat height is" + seatHeight);
    }
}

//drier class
public class TestBicycle {
    public static void main(String args[])
    {
        MountainBike mb = new MountainBike(3,100,25);
        System.out.println(mb.toString());
    }
}
