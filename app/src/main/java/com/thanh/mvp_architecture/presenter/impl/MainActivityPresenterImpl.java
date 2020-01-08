package com.thanh.mvp_architecture.presenter.impl;

import com.thanh.mvp_architecture.presenter.MainActivityPresenter;

public class MainActivityPresenterImpl implements MainActivityPresenter {
    private View view;

    public MainActivityPresenterImpl(View view){

        this.view = view;
    }

    @Override
    public void init() {
        view.initDataPhotoCollection();
        view.initAdapter();
        view.initRecyclerView();
    }
}
