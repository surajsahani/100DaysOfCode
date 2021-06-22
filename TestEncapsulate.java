class Encapsulate {

    private String geekName;
    private int geekRoll;
    private int geekAge;

    public String getGeekName() {
        return geekName;
    }

    public void setGeekName(String geekName) {
        this.geekName = geekName;
    }

    public int getGeekRoll() {
        return geekRoll;
    }

    public void setGeekRoll(int geekRoll) {
        this.geekRoll = geekRoll;
    }

    public int getGeekAge() {
        return geekAge;
    }

    public void setGeekAge(int geekAge) {
        this.geekAge = geekAge;
    }


    public void setRoll(int newRoll) {
        geekRoll = newRoll;
    }
}
public class TestEncapsulate {
    public static void main(String[] args)
    {
     Encapsulate obj = new Encapsulate();

     //setting values of the variables
        obj.setGeekName("Hash");
        obj.setGeekAge(19);
        obj.setGeekRoll(51);

        System.out.println("Geeks name: " + obj.getGeekName());
        System.out.println("Geek's age: " + obj.getGeekAge());
        System.out.println("Geek's roll: " + obj.getGeekRoll());

    }
}
