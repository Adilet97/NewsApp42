package com.example.newsapp42;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp42.ui.home.NewsAdapter;

public class BoardAdapter extends RecyclerView.Adapter<BoardAdapter.ViewHolder> {
    private String[] titles = new String[]{"Кыргызча","Русский", "English"};
    private String[] description = new String[]{"Салам","Привет", "Hello"};
    private int[] getImage = new int[]{R.drawable.news_kg};



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pager_board, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        private TextView textView2;
        private Button btnWelcome;
        private ImageView imageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textViewBoard);
            textView2=itemView.findViewById(R.id.textViewBoard2);
            btnWelcome=itemView.findViewById(R.id.btnBoardWelcome);
        }

        public void bind(int position) {
            textView.setText(titles[position]);
            textView2.setText(description[position]);
            if (position==2) btnWelcome.setVisibility(View.VISIBLE);
            else btnWelcome.setVisibility(View.INVISIBLE);

        }
    }

}
