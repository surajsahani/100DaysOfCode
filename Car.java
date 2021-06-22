class Car {
    int no;
    Car(int no)
    {this.no = no;}
}

class Maina
{
    public static void swap(Car c1, Car c2)
    {
    int temp = c1.no;
    c1.no = c2.no;
    c2.no = temp;
    }

    public static void main(String[] args) {
        Car c1 = new Car(1);
        Car c2 = new Car(2);
        swap(c1, c2);
        System.out.println("c1.no = " +c1.no);
        System.out.println("c2.no = " +c2.no);
    }
}
