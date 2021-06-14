abstract class Base {
  final void fun() {
      System.out.println("Base fun() called"); }
}
class Derived extends Base {

}
class Main{
    public static void main(String[] args) {
        Derived d = new Derived();
        d.fun();
    }
}
