package com.bagicode.myapplicationpertemuan7.withlistener;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bagicode.myapplicationpertemuan7.R;

import java.util.List;

public class MahasiwaAdapter extends RecyclerView.Adapter<MahasiwaAdapter.MyViewHolder>{

    private List<MahasiswaModel> dataList;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, subtitle;
        public LinearLayout card;

        public MyViewHolder(View view){
            super(view);

            title = view.findViewById(R.id.tv_nama);
            subtitle = view.findViewById(R.id.tv_kelas);
            card = view.findViewById(R.id.ll_card);
        }

    }

    public MahasiwaAdapter(List<MahasiswaModel> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.row_mahasiswa, viewGroup, false);

        context = viewGroup.getContext();

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        final MahasiswaModel data = dataList.get(position);

        myViewHolder.title.setText(data.nama);
        myViewHolder.subtitle.setText(data.kelas);

        myViewHolder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, "ini nama di klik "+data.nama, Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
