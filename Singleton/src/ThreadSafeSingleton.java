public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    //Check if two hilos
//   public static synchronized ThreadSafeSingleton getInstance(){
////        if (instance== null){
////            instance=new ThreadSafeSingleton();
////        }
////        return  instance;
////    }
public static ThreadSafeSingleton getInstance(){
    if (instance==null){
        synchronized (ThreadSafeSingleton.class) {
            if (instance == null) {
                instance = new ThreadSafeSingleton();
            }
        }
    }
    return instance;
    }
}
