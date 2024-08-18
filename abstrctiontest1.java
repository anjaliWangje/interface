package abstractionclass;

abstract  class abstrcation1{
    abstract void test();
}

abstract class abstraction2 extends abstrcation1{
    abstract void show();


    @Override
      void test() {
   System.out.println("implementing parent class method");

}




public class abstrctiontest1 {

}
}
