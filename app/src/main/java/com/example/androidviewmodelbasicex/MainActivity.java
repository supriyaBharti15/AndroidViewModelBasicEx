package com.example.androidviewmodelbasicex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;

import com.example.androidviewmodelbasicex.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //private int num = 0;

    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);

        binding.score.setText(String.valueOf(viewModel.getScore()));
        binding.start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                addScore();
                viewModel.setScore();
                binding.score.setText(String.valueOf(viewModel.getScore()));
            }
        });

        binding.reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //resetValue();
                viewModel.resetScore();
                binding.score.setText(String.valueOf(viewModel.getScore()));
            }
        });
    }


    /*private void addScore() {
        num++;
        binding.score.setText(String.valueOf(num));
    }

    private void resetValue() {
        num = 0;
        binding.score.setText(String.valueOf(num));
    }*/
}
