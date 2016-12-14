package com.drunkpiano.mvpsample.ShowSlogan;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.drunkpiano.mvpsample.R;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Fragment. It's the View in the MVP architecture.
 * Created by DrunkPiano on 2016/12/13.
 */

public class SloganFragment extends Fragment implements SloganContract.View {

    @BindView(R.id.fab)
    FloatingActionButton mFab;

    @BindView(R.id.slogan_text)
    TextView mSloganText;

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    private static int mCount = 0;
    private String mSlogan;
    SloganContract.Presenter mPresenter;

    public static SloganFragment newInstance() {
        return new SloganFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Since we already got butterknife, is "inflate" a must?
        View root = inflater.inflate(R.layout.fragment_slogan, container, false);
        ButterKnife.bind(this, root);
        ((AppCompatActivity) getActivity()).setSupportActionBar(mToolbar);
        mToolbar.setTitle(R.string.app_name);
//        mFab = (FloatingActionButton) root.findViewById(R.id.fab);
//        mSloganText = (TextView) root.findViewById(R.id.slogan_text);

        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.updateCount(++mCount);
                mSloganText.setText(mSlogan);
            }
        });
        return root;
    }

    @Override
    public void setPresenter(SloganContract.Presenter presenter) {
        mPresenter = presenter;
    }

    //MVC允许 View Model交互， MVP的View和Model交互由Presenter完成
    @Override
    public void setSlogan(final String slogan) {
        this.mSlogan = slogan;
    }
}
