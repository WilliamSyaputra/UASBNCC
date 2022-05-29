package com.william.myapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentSatu extends Fragment {

    View view;
    Button buttonPlus, buttonMinus, buttonReset;
    TextView Angka;
    private int Counter = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmentsatu, container, false);
        buttonPlus = (Button) view.findViewById(R.id.BtnPlus);
        buttonMinus = (Button) view.findViewById(R.id.BtnMinus);
        buttonReset = (Button) view.findViewById(R.id.BtnReset);

        Angka = (TextView) view.findViewById(R.id.AngkaCounter);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Counter++;
                Angka.setText(Integer.toString(Counter));
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Counter--;
                Angka.setText(Integer.toString(Counter));
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Counter = 0;
                Angka.setText(Integer.toString(Counter));
            }
        });
        return view;
    }
}

