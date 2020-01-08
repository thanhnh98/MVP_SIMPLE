package com.thanh.mvp_architecture.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.thanh.mvp_architecture.R;
import com.thanh.mvp_architecture.model.PhotoModel;
import com.thanh.mvp_architecture.presenter.MainActivityPresenter;
import com.thanh.mvp_architecture.presenter.impl.MainActivityPresenterImpl;
import com.thanh.mvp_architecture.repo.Impl.PhotoRepositoryImpl;
import com.thanh.mvp_architecture.repo.PhotoRepository;
import com.thanh.mvp_architecture.ui.adapter.PhotoCollectionAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainActivityPresenter.View {
    RecyclerView recyclerView;
    PhotoCollectionAdapter adapter;
    List<PhotoModel> listData;
    MainActivityPresenter presenter;
    PhotoRepository photoRepository;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rcv_photo);
        presenter=new MainActivityPresenterImpl(this,this);
        photoRepository=new PhotoRepositoryImpl(this);
        presenter.init();

    }


    @Override
    public void initAdapter(Context context, List<PhotoModel> listData) {
        adapter=new PhotoCollectionAdapter(context,listData);

    }

    @Override
    public void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
