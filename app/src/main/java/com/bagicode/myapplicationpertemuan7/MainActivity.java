package com.bagicode.myapplicationpertemuan7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bagicode.myapplicationpertemuan7.withlistener.MahasiswaModel;
import com.bagicode.myapplicationpertemuan7.withlistener.MahasiwaAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<MahasiswaModel> dataList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MahasiwaAdapter mahasiwaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_mahasiswa);
        mahasiwaAdapter = new MahasiwaAdapter(dataList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiwaAdapter);

        loadDummy();
    }

    private void loadDummy() {

        MahasiswaModel mahasiswaModel;
        mahasiswaModel = new MahasiswaModel("Robby", "Java");
        dataList.add(mahasiswaModel);
        mahasiswaModel = new MahasiswaModel("Robby", "Java");
        dataList.add(mahasiswaModel);
        mahasiswaModel = new MahasiswaModel("Robby", "Java");
        dataList.add(mahasiswaModel);
        mahasiswaModel = new MahasiswaModel("Robby", "Java");
        dataList.add(mahasiswaModel);

    }
}
