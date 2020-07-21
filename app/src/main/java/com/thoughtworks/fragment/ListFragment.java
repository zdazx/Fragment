package com.thoughtworks.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class ListFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() == null) {
            return;
        }
        Button androidBtn = getActivity().findViewById(R.id.android_btn);
        androidBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DetailFragment detailFragment = new DetailFragment();
                if (getActivity() == null) {
                    return;
                }
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.detail_container, detailFragment);
                TextView detailTextView = getActivity().findViewById(R.id.detail);
                detailTextView.setText(R.string.android_detail);
                transaction.commit();
            }
        });

        Button javaBtn = getActivity().findViewById(R.id.java_btn);
        javaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DetailFragment detailFragment = new DetailFragment();
                if (getActivity() == null) {
                    return;
                }
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.detail_container, detailFragment);
                TextView detailTextView = getActivity().findViewById(R.id.detail);
                detailTextView.setText(R.string.java_detail);
                transaction.commit();
            }
        });
    }
}
