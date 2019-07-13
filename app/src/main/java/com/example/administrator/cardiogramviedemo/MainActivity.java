package com.example.administrator.cardiogramviedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Integer> list;
    private EcgWaveView ecgWaveView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        ecgWaveView = findViewById(R.id.xiaolajiao_base_ecgwave);
        int pagerSpeed = EcgWaveView.ECG_PAGER_SPEED_25;
        float calibration = EcgWaveView.ECG_CALIBRATION_10;
        ecgWaveView.setPagerSpeed(pagerSpeed);
        ecgWaveView.setCalibration(calibration);
    }

    private void initData() {
        if (list == null) {
            list = new ArrayList<>();
        }
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int r= random.nextInt(10000)+1;
            list.add(r);
        }
        ecgWaveView.clear();
        ecgWaveView.preparePoints(list);
    }



}
