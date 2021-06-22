// A Java program to demonstrate that simply swapping
// object references doesn't work

// A car with number and name
class CarB
{
    int model, no;

    // Constructor
    CarB(int model, int no)
    {
        this.model = model;
        this.no = no;
    }

    // Utility method to print Car
    void print()
    {
        System.out.println("no = " + no +
                ", model = " + model);
    }
}

// A class that uses Car
class MainB
{
    // swap() doesn't swap c1 and c2
    public static void swap(CarB c1, CarB c2)
    {
        CarB temp = c1;
        c1 = c2;
        c2 = temp;
    }

    // Driver method
    public static void main(String[] args)
    {
        CarB c1 = new CarB(101, 1);
        CarB c2 = new CarB(202, 2);
        swap(c1, c2);
        c1.print();
        c2.print();
    }
}
