package com.example.myapp08;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp08.databinding.ActivityMain4Binding;
import com.example.myapp08.databinding.ItemPhone3Binding;

import java.util.ArrayList;

public class PersonAdapter4 extends RecyclerView.Adapter<PersonAdapter4.ViewHolder> {
    ArrayList<Person4> personList = new ArrayList<>();
    ItemPhone3Binding binding;
    //인터페이스
    public interface onItemClickListener{
        void onItemClick(int pos);
    }
    private onItemClickListener onItemClickListener;
    //setter
    public void setOnItemClickListener(PersonAdapter4.onItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    //추가
    public void addItem(Person4 person4){
        personList.add(person4);
        notifyDataSetChanged();
    }
    //삭제
    public void removeItem(int position){
        personList.remove(position);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PersonAdapter4.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_phone3,parent,false );
        binding = ItemPhone3Binding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter4.ViewHolder holder, int position) {
        Person4 person4 = personList.get(position);
        holder.setItem(person4);

    }

    @Override
    public int getItemCount() {
        return personList==null?0:personList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    onItemClickListener.onItemClick(position);
                }
            });
        }
        public void setItem(Person4 person4){
            binding.txtmain.setText(person4.getName());
            binding.txtTel.setText(person4.getTel());
        }
    }

    public Person4 getItem(int position){
        return personList.get(position);
    }
}
