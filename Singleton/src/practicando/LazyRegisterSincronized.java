package practicando;

public class LazyRegisterSincronized {

    private static volatile LazyRegisterSincronized INSTANCE;
    private LazyRegisterSincronized(){

    }

    public static LazyRegisterSincronized getInstance(){
        if (INSTANCE==null){
            synchronized (LazyRegisterSincronized.class){
                if (INSTANCE==null){
                    INSTANCE=new LazyRegisterSincronized();
                }
            }

        }
        return INSTANCE;
    }
}
