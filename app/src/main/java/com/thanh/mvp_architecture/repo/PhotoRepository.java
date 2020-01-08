package com.thanh.mvp_architecture.repo;

import com.thanh.mvp_architecture.model.PhotoModel;

import java.util.List;

public interface PhotoRepository {
    List<PhotoModel> getPhotos();
}
