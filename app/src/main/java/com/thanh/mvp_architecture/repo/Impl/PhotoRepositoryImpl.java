package com.thanh.mvp_architecture.repo.Impl;

import android.content.Context;

import com.thanh.mvp_architecture.model.PhotoModel;
import com.thanh.mvp_architecture.repo.PhotoRepository;

import java.util.ArrayList;
import java.util.List;

public class PhotoRepositoryImpl implements PhotoRepository {
    private Context context;

    public PhotoRepositoryImpl(Context context){

        this.context = context;
    }

    @Override
    public List<PhotoModel> getPhotos() {
        List<PhotoModel> listData;
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
        return listData;
    }
}
