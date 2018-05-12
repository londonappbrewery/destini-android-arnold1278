package com.londonappbrewery.destini;

public class StoryChoices {
    private int mStoryViewID;
    private int mButtonTopID;
    private int mButtonBottomID;
    private int mIndex;

    public StoryChoices(int storyResID, int buttonTopResID, int buttonButtonBottomResID, int index){
        mStoryViewID = storyResID;
        mButtonTopID = buttonTopResID;
        mButtonBottomID = buttonButtonBottomResID;
        mIndex = index;
    }

    public int getStoryViewID() {
        return mStoryViewID;
    }

    public void setStoryViewID(int storyViewID) {
        mStoryViewID = storyViewID;
    }

    public int getButtonTopID() {
        return mButtonTopID;
    }

    public void setButtonTopID(int buttonTopID) {
        mButtonTopID = buttonTopID;
    }

    public int getButtonBottomID() {
        return mButtonBottomID;
    }

    public void setButtonBottomID(int buttonBottomID) {
        mButtonBottomID = buttonBottomID;
    }

    public int getIndex() {
        return mIndex;
    }

    public void setIndex(int index) {
        mIndex = index;
    }
}
