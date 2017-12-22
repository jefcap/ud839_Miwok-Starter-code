package com.example.android.miwok;

import android.media.Image;
import android.widget.ImageView;

/**
 * Created by jeffecap on 18/07/17.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;

    /**
     * Create a new Word object
     * @param defaultTranslation is the word in language that the user is
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     *
     * @param defaultTranslation
     * @param miwokTranslation
     * @param ImageResourceId is the drawable resource ID for the image assigned
     */
    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
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

    /**
     * Return the image resource ID of the word
     * @return
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
