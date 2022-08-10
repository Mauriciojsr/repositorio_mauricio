package ramos.s.j.mauricio.Conceitos_Classes_Abstratas_e_Interfaces.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ramos.s.j.mauricio.Conceitos_Classes_Abstratas_e_Interfaces.R;


public class MensagemFrag extends Fragment {

    public MensagemFrag() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layoutFragment = inflater.inflate(R.layout.fragment_mensagem, container, false);


        return layoutFragment;
    }
}