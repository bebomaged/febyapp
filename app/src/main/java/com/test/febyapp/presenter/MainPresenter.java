package com.test.febyapp.presenter;

import com.test.febyapp.model.UserModel;
import com.test.febyapp.view.MainContract;

public class MainPresenter implements MainContract.Presenter {
    private MainContract.View view;

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void getUserInfo() {
        // In a real-world scenario, you would fetch user data from a database or API
        UserModel user = new UserModel("feby", "fayoum");
        view.displayUserInfo(user);
    }
}
