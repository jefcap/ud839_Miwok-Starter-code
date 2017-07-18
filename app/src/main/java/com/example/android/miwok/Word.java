package com.example.android.miwok;

/**
 * Created by jeffecap on 18/07/17.
 */

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    //Constructor
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the word
     * @return
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word
     * @return
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

}
