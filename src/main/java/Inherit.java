public class Inherit extends Inheritence{
  int bonus = 200;
  public void bark(){
      System.out.println("barking");
  }

  public static void main(String []args){
     Child c =  new Child();
     Inherit in = new Inherit();

      c.eat();
      in.bark();


      System.out.println("Print the values"+ in.bonus);
      System.out.println("Print the values"+ c.salary);
      System.out.println("Print the values"+ c.s);


  }


}
class Child extends Inheritence{
    String s = "enha";

}


