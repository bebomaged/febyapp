package com.test.febyapp.view;


import com.test.febyapp.model.UserModel;

public interface MainContract {
    interface View {
        void displayUserInfo(UserModel user);
    }

    interface Presenter {
        void getUserInfo();
    }
}
