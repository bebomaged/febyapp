package com.test.febyapp;
//feby hanna dawoud
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.test.febyapp.model.UserModel;
import com.test.febyapp.presenter.MainPresenter;
import com.test.febyapp.view.MainContract;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private MainPresenter presenter;
    private TextView userInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInfoTextView = findViewById(R.id.userInfoTextView);
        Button getUserInfoButton = findViewById(R.id.getUserInfoButton);

        presenter = new MainPresenter(this);

        // Set OnClickListener for the button
        getUserInfoButton.setOnClickListener(v -> {
            // Request user info from the presenter when the button is clicked
            presenter.getUserInfo();
        });
    }

    @Override
    public void displayUserInfo(UserModel user) {
        // Display user information in the TextView
        String userInfo = "Name: " + user.getName() + "\nAddress: " + user.getAddress();
        userInfoTextView.setText(userInfo);
    }
}
