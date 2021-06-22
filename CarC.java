public class CarC
{
 int model, no;

 CarC(int model, int no)
 {
     this.model = model;
     this.no = no;
 }

 void print()
 {
     System.out.println("no = " + no + ", model =" + model);
 }
}
class CarWrapper
{
    CarC c;
    CarWrapper(CarC c)
    {this.c = c;}
}

class MainC
{
    public static void swap(CarWrapper cw1, CarWrapper cw2)
    {
        CarC temp = cw1.c;
        cw1.c = cw2.c;
        cw2.c = temp;
    }

    public static void main(String[] args)
    {
    CarC c1 = new CarC(101, 1);
    CarC c2 = new CarC(202,2);
    CarWrapper cw1= new CarWrapper(c1);
    CarWrapper cw2 = new CarWrapper(c2);
    swap(cw1, cw2);;
    cw1.c.print();
    cw2.c.print();

    }
}