package com.github.paolorotolo.appintroexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class IntroWithLongText extends AppIntro {
  private static final String TAG = "IntroWithLongText";

    @Override
    public void init(Bundle savedInstanceState) {

        addSlide(AppIntroFragment.newInstance(getString(R.string.intro_slide_1_title), getString(R.string.intro_slide_1_body), R.drawable.ic_slide1, getResources().getColor(R.color.intro_step1)));
        addSlide(AppIntroFragment.newInstance(getString(R.string.intro_slide_2_title), getString(R.string.intro_slide_2_body), R.drawable.ic_slide2, getResources().getColor(R.color.intro_step2)));
        addSlide(AppIntroFragment.newInstance(getString(R.string.intro_slide_3_title), getString(R.string.intro_slide_3_body), R.drawable.ic_slide3, getResources().getColor(R.color.intro_step3)));
        addSlide(AppIntroFragment.newInstance(getString(R.string.intro_slide_4_title), getString(R.string.intro_slide_4_body), R.drawable.ic_slide4, getResources().getColor(R.color.intro_step4)));
    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onNextPressed() {
    }

    @Override
    public void onSkipPressed() {
        loadMainActivity();
        Toast.makeText(getApplicationContext(),
                getString(R.string.skip), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDonePressed() {
        loadMainActivity();
    }

    @Override
    public void onSlideChanged(){
    }

    public void getStarted(View v){
        loadMainActivity();
    }
}
