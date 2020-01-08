package com.thanh.mvp_architecture.presenter;

public interface MainActivityPresenter {
    void init();
    interface View{
        void initAdapter();
        void initRecyclerView();
        void initDataPhotoCollection();
    }

}
