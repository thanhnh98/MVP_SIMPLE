package com.thanh.mvp_architecture.presenter.impl;

import android.content.Context;

import com.thanh.mvp_architecture.presenter.MainActivityPresenter;
import com.thanh.mvp_architecture.repo.Impl.PhotoRepositoryImpl;
import com.thanh.mvp_architecture.repo.PhotoRepository;

public class MainActivityPresenterImpl implements MainActivityPresenter {
    private Context context;
    private View view;
    private PhotoRepository repository;
    public MainActivityPresenterImpl(Context context,View view){
        this.context = context;
        this.view = view;
        this.repository=new PhotoRepositoryImpl(context);
    }

    @Override
    public void init() {
        view.initAdapter(context,repository.getPhotos());
        view.initRecyclerView();
    }
}
