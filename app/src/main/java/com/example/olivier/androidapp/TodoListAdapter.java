package com.example.olivier.androidapp;

import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class TodoListAdapter extends RecyclerView.Adapter<TodoListViewHolder> {

    private final List<Pair<String, String>> tasks = DataManager.getInstance().getTasks();

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    @Override
    public TodoListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.task_cell, parent, false);
        return new TodoListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TodoListViewHolder holder, int position) {
        Pair<String, String> pair = tasks.get(position);
        holder.display(pair);
    }
}
