/*
* 第一种方法
* */

public class AppManager {
    private volatile static AppManager instance;

    private AppManager() {

    }
    public static AppManager getAppManager() {
        if (instance == null) {
            synchronized (AppManager.class) {
                if (instance == null) {
                    instance = new AppManager();
                    instance.activityStack = new Stack();
                }
            }
        }
        return instance;
    }

}

/*
*第二种方法
*/
public class AudioManager{
    private static AudioManager mInstance;
    private AudioManager(){}
    public static AudioManager getInstance(){
        if(mInstance == null){
            synchronized (AudioManager.class){
                if(mInstance == null){
                    mInstance = new AudioManager();
                }
            }
        }
        return mInstance;
    }

}