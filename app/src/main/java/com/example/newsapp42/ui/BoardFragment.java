package com.example.newsapp42.ui;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.newsapp42.BoardAdapter;
import com.example.newsapp42.R;
import com.example.newsapp42.databinding.FragmentBoardBinding;
import com.example.newsapp42.databinding.FragmentProfileBinding;

import java.util.List;

public class BoardFragment extends Fragment {
    private FragmentBoardBinding binding;
    List<BoardFragment> mListScreen;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBoardBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        BoardAdapter adapter = new BoardAdapter();
        binding.viewPager.setAdapter(adapter);
//        binding.dotsIndicator.setViewPager();
    }

}