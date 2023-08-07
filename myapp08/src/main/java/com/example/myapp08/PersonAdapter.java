package com.example.myapp08;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {
    private ArrayList<Person> personList = new ArrayList<>();
    public void addItem(Person person){
        personList.add(person);
    }

    @NonNull
    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.person_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder holder, int position) {
        Person person = personList.get(position);
        holder.setItem(person);

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvName, tvPhone;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tvName);
            tvPhone=itemView.findViewById(R.id.tvPhone);
        }
        public void setItem(Person person){
            tvName.setText(person.getName());
            tvPhone.setText(person.getMobile());
        }
    }
}
