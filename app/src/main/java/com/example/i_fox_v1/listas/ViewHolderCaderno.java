package com.example.i_fox_v1.listas;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.i_fox_v1.R;

public class ViewHolderCaderno extends RecyclerView.ViewHolder {

    TextView tvNomeCaderno, tvQntCaderno;

    public ViewHolderCaderno(@NonNull View itemView) {
        super(itemView);

        tvNomeCaderno = itemView.findViewById(R.id.tvNomeCaderno);
        tvQntCaderno = itemView.findViewById(R.id.tvQntCaderno);

    }
    }


