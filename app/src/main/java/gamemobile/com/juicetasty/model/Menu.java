package gamemobile.com.juicetasty.model;

/**
 * Created by Asus on 14/10/2017.
 */

public class Menu {
    private int mPicture;
    private String mName;

    public Menu(int mPicture, String mName) {
        this.mPicture = mPicture;
        this.mName = mName;
    }

    public int getmPicture() {
        return mPicture;
    }

    public void setmPicture(int mPicture) {
        this.mPicture = mPicture;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
