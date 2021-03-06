//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.1.
//


package com.drjane.promise.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class RegistSmsFragment_
    extends com.drjane.promise.ui.fragment.RegistSmsFragment
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private View contentView_;
    public final static String M_PHONE_NUM_ARG = "mPhoneNum";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    @Override
    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        return contentView_;
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        injectFragmentArguments_();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static RegistSmsFragment_.FragmentBuilder_ builder() {
        return new RegistSmsFragment_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        {
            View view = hasViews.findViewById(com.drjane.promise.R.id.btn_Regist_finish);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        RegistSmsFragment_.this.onRegistFinish();
                    }

                }
                );
            }
        }
    }

    private void injectFragmentArguments_() {
        Bundle args_ = getArguments();
        if (args_!= null) {
            if (args_.containsKey(M_PHONE_NUM_ARG)) {
                mPhoneNum = args_.getString(M_PHONE_NUM_ARG);
            }
        }
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<RegistSmsFragment_.FragmentBuilder_, com.drjane.promise.ui.fragment.RegistSmsFragment>
    {


        @Override
        public com.drjane.promise.ui.fragment.RegistSmsFragment build() {
            RegistSmsFragment_ fragment_ = new RegistSmsFragment_();
            fragment_.setArguments(args);
            return fragment_;
        }

        public RegistSmsFragment_.FragmentBuilder_ mPhoneNum(String mPhoneNum) {
            args.putString(M_PHONE_NUM_ARG, mPhoneNum);
            return this;
        }

    }

}
