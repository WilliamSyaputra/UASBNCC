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

public class FragmentDua extends Fragment {

    View view;
    Button buttonHitungPersegi, buttonHitungSegitiga, buttonHitungLingkaran;
    EditText Sisi, Alas, Tinggi, JariJari;
    TextView HasilPersegi, HasilSegitiga, HasilLingkaran;

    int ansPersegi = 0;
    int ansSegitiga = 0;
    int ansLingkaran = 0;



        @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragmentdua, container, false);

        buttonHitungPersegi = (Button) view.findViewById(R.id.BtnHitungPersegi);
        buttonHitungLingkaran = (Button) view.findViewById(R.id.BtnHitungLingkaran);
        buttonHitungSegitiga = (Button) view.findViewById(R.id.BtnHitungSegitiga);

        Sisi = (EditText) view.findViewById(R.id.et_Sisi);
        Alas = (EditText) view.findViewById(R.id.et_Alas);
        Tinggi =(EditText) view.findViewById(R.id.et_Tinggi);
        JariJari =(EditText) view.findViewById(R.id.et_JariJari);

        HasilPersegi = view.findViewById(R.id.HasilPersegi);
        HasilSegitiga = view.findViewById(R.id.HasilSegitiga);
        HasilLingkaran = view.findViewById(R.id.HasilLingkaran);

        String sisi = Sisi.getText().toString();
        String alas = Alas.getText().toString();
        String tinggi = Tinggi.getText().toString();
        String jari = JariJari.getText().toString();

        int SISI = Integer.parseInt(sisi);
        int ALAS = Integer.parseInt(alas);
        int TINGGI = Integer.parseInt(tinggi);
        int JARI = Integer.parseInt(jari);

        buttonHitungPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sisi.isEmpty()){
                    Toast.makeText(getActivity(), "Sisi Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else {
                    ansPersegi = (int) (SISI * SISI);
                    String Jawab1 = String.valueOf(ansPersegi);
                    HasilPersegi.setText(Jawab1);
                    ansPersegi = 0;
                }
            }
        });
        buttonHitungSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (alas.isEmpty() && tinggi.isEmpty()){
                    Toast.makeText(getActivity(), "Alas dan Tinggi Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else if (alas.isEmpty()){
                    Toast.makeText(getActivity(), "Alas Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else if (tinggi.isEmpty()){
                    Toast.makeText(getActivity(), "Tinggi Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else {
                    ansSegitiga = (ALAS * TINGGI) / 2;
                    String Jawab2 = String.valueOf(ansSegitiga);
                    HasilPersegi.setText(Jawab2);
                    ansPersegi = 0;
                }
            }
        });
        buttonHitungLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jari.isEmpty()){
                    Toast.makeText(getActivity(), "Jari - Jari Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else {
                    ansLingkaran = (3.14 * JARI * JARI);
                    String Jawab3 = String.valueOf(ansLingkaran);
                    HasilLingkaran.setText(Jawab3);
                    ansLingkaran = 0;
                }
            }
        });

        return view;
    }
}

