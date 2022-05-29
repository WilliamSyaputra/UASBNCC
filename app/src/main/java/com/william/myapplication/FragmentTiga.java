package com.william.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentTiga extends Fragment {

    View view;
    Button btnHitungBalok, btnHitungPiramida, btnHitungTabung;
    EditText BPanjang, BLebar, BTinggi, PTinggi, PSisi, TJari, TTinggi;
    TextView HBalok, HPiramida, HTabung;

    int AnsBalok = 0;
    int AnsPiramida = 0;
    int AnsTabung = 0;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmenttiga, container, false);

        btnHitungBalok = (Button) view.findViewById(R.id.BTN_Balok);
        btnHitungPiramida = (Button) view.findViewById(R.id.BTN_Piramida);
        btnHitungTabung = (Button) view.findViewById(R.id.BTN_Tabung);

        BPanjang = (EditText) view.findViewById(R.id.Panjang);
        BLebar = (EditText) view.findViewById(R.id.Lebar);
        BTinggi = (EditText) view.findViewById(R.id.BTinggi);
        PTinggi = (EditText) view.findViewById(R.id.PTinggi);
        PSisi = (EditText) view.findViewById(R.id.PSisi);
        TJari = (EditText) view.findViewById(R.id.TJAriJari);
        TTinggi = (EditText) view.findViewById(R.id.TTinggi);

        HBalok = view.findViewById(R.id.);
        HPiramida = view.findViewById(R.id.TTinggi);
        return view;
    }
}

