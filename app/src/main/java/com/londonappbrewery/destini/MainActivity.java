package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final int story1Index = 0;
    private final int story2Index = 1;
    private final int story3Index = 2;

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView storyTextView;
    private Button answerButtonTop;
    private Button answerButtonBottom;
    private int mStoryIndex = 1;

    private StoryChoices[] mStoryBank = new StoryChoices[] {
            new StoryChoices(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2, 1),
            new StoryChoices(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2, 2),
            new StoryChoices(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2, 3)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        answerButtonTop = (Button) findViewById(R.id.buttonTop);
        answerButtonBottom = (Button) findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        answerButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1){
                    storyTextView.setText(mStoryBank[story3Index].getStoryViewID());
                    answerButtonTop.setText(mStoryBank[story3Index].getButtonTopID());
                    answerButtonBottom.setText(mStoryBank[story3Index].getButtonBottomID());
                    mStoryIndex = 3;
                }
                else if(mStoryIndex == 2){
                    storyTextView.setText(mStoryBank[story3Index].getStoryViewID());
                    answerButtonTop.setText(mStoryBank[story3Index].getButtonTopID());
                    answerButtonBottom.setText(mStoryBank[story3Index].getButtonBottomID());
                    mStoryIndex = 3;
                }
                else{
                    storyTextView.setText(R.string.T6_End);
                    answerButtonTop.setVisibility(View.GONE);
                    answerButtonBottom.setVisibility(View.GONE);
                }
            }
        });





        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        answerButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1){
                    storyTextView.setText(mStoryBank[story2Index].getStoryViewID());
                    answerButtonTop.setText(mStoryBank[story2Index].getButtonTopID());
                    answerButtonBottom.setText(mStoryBank[story2Index].getButtonBottomID());
                    mStoryIndex = 2;
                }
                else if(mStoryIndex == 2){
                    storyTextView.setText(R.string.T4_End);
                    answerButtonTop.setVisibility(View.GONE);
                    answerButtonBottom.setVisibility(View.GONE);
                }
                else{
                    storyTextView.setText(R.string.T5_End);
                    answerButtonTop.setVisibility(View.GONE);
                    answerButtonBottom.setVisibility(View.GONE);
                }
            }
        });

    }
}
