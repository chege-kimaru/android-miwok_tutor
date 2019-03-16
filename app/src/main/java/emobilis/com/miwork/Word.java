package emobilis.com.miwork;

/**
 * Created by Kevin Kimaru Chege on 4/22/2017.
 */

public class Word {
    private String mDefaultTranslatioin;
    private String mMiwokTranslation;
    private int mImageResourceId = No_IMAGE_PROVIDED;
    private static final int No_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;


    public Word(String defaultTranslatioin, String miwokTranslation, int audioResourceId) {
        mDefaultTranslatioin = defaultTranslatioin;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslatioin, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslatioin = defaultTranslatioin;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslatioin;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != No_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }



}
