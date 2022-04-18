package com.example.newsapp42.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp42.R;
import com.example.newsapp42.models.Article;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
    private ArrayList<Article> list;

    public NewsAdapter(ArrayList<Article> list) {
        this.list = list;
    }

    public NewsAdapter() {
        list=new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void addItem(Article article) {
        list.add(0,article);
        notifyItemInserted(0);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView =  itemView.findViewById(R.id.textTitle);
        }

        public void bind(Article article) {
            textView.setText(article.getText());
        }
    }
}
