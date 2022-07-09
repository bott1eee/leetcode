package pattern.singleton;

public class Singleton {


    //饿汉模式
//    private static Singleton INSTANCE = new Singleton();
//
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        return INSTANCE;
//    }

    //懒汉模式
//    private static Singleton INSTANCE = null;
//
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        if (INSTANCE == null) {
//            INSTANCE = new Singleton();
//        }
//        return INSTANCE;
//    }

    //双重锁懒汉模式
//    private volatile static Singleton INSTANCE = null;
//
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        if (INSTANCE == null) {
//            synchronized (Singleton.class) {
//                if (INSTANCE == null) {
//                    INSTANCE = new Singleton();
//                }
//            }
//        }
//        return INSTANCE;
//    }

    //静态内部类
    private Singleton(){}

    private static class SingletonHolder{

        private static Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
