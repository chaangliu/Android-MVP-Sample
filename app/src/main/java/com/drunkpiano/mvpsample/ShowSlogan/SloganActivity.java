package com.drunkpiano.mvpsample.ShowSlogan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.drunkpiano.mvpsample.R;

import butterknife.ButterKnife;

/**
 * @author drunkpiano（知还）
 * @date 2016/12/14
 *
 * Imitation of https://github.com/googlesamples/android-architecture/tree/todo-mvp/
 *
 * 可以参考：https://larrylawrence.github.io/2016/12/13/EP17-MvpSample/
 *
 * Activity，承载着View和Presenter。
 */
public class SloganActivity extends AppCompatActivity {
    SloganModel mSloganModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slogan);
        ButterKnife.bind(this);
        mSloganModel = new SloganModel();
        mSloganModel.sloganContent = "please press the fab";
        SloganFragment sloganFragment = SloganFragment.newInstance();
        getSupportFragmentManager().beginTransaction().add(R.id.container_activity, sloganFragment).commitAllowingStateLoss();
        new SloganPresenter(
                mSloganModel, sloganFragment);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_slogan, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
