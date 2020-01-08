package com.thanh.mvp_architecture.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.thanh.mvp_architecture.R;
import com.thanh.mvp_architecture.model.PhotoModel;
import com.thanh.mvp_architecture.presenter.MainActivityPresenter;
import com.thanh.mvp_architecture.presenter.impl.MainActivityPresenterImpl;
import com.thanh.mvp_architecture.ui.adapter.PhotoCollectionAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainActivityPresenter.View {
    RecyclerView recyclerView;
    PhotoCollectionAdapter adapter;
    List<PhotoModel> listData;
    MainActivityPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rcv_photo);
        presenter=new MainActivityPresenterImpl(this);
        presenter.init();

    }

    @Override
    public void initAdapter() {
        adapter=new PhotoCollectionAdapter(this,listData);
    }

    @Override
    public void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void initDataPhotoCollection() {
        String imageLink="http://www.chomeo.com/wp-content/uploads/2016/04/huan-luyen-cho-khong-can-bay.jpg";
        listData=new ArrayList<>();
        listData.add(new PhotoModel(imageLink,"Mèo","Đây là con mèo!"));
        listData.add(new PhotoModel(imageLink,"Mèo","Đây là con mèo!"));
        listData.add(new PhotoModel(imageLink,"Mèo","Đây là con mèo!"));
        listData.add(new PhotoModel(imageLink,"Mèo","Đây là con mèo!"));
        listData.add(new PhotoModel(imageLink,"Mèo","Đây là con mèo!"));
        listData.add(new PhotoModel(imageLink,"Mèo","Đây là con mèo!"));
        listData.add(new PhotoModel(imageLink,"Mèo","Đây là con mèo!"));
        listData.add(new PhotoModel(imageLink,"Mèo","Đây là con mèo!"));
        listData.add(new PhotoModel(imageLink,"Mèo","Đây là con mèo!"));
        listData.add(new PhotoModel(imageLink,"Mèo","Đây là con mèo!"));
    }
}
