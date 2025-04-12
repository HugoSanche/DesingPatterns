package practicando;

public class LazyRegisterInnerclass {


    private LazyRegisterInnerclass(){

    }
    private static class InnerLazyRegister{
      static   LazyRegisterInnerclass INSTANCE=new LazyRegisterInnerclass();
    }

    public static LazyRegisterInnerclass getInstance(){
        return InnerLazyRegister.INSTANCE;
    }
}
