package com.example.btrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ItemViewHoder> {
    private ArrayList<User> mArrayUsers;

    public UserAdapter(){ mArrayUsers = new ArrayList<>();
    }

    public void submitData (ArrayList<User> arrayUsers){
        if (arrayUsers!= null){
            mArrayUsers.clear();
            mArrayUsers.addAll(arrayUsers) ;
            notifyDataSetChanged();
        }
    }
    public  void  addItem (User user){
        if (user != null){
            mArrayUsers.add(user);
            notifyDataSetChanged();
        }
    }


    @NonNull
    @Override
    public ItemViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.item_layout_user,null,false);
        return new ItemViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHoder holder, int position) {
        User user = mArrayUsers.get(position);
       holder.mImage.setImageResource(user.getImage());
       holder.mTviewName.setText(user.getName());
       holder.mTviewMota.setText(user.getMota());
       holder.mTviewGia.setText(String.valueOf(user.getGia()));
       holder.mTviewDonvi.setText(user.getDonvitien());


    }

    @Override
    public int getItemCount() {

        return mArrayUsers.size();
    }

    class ItemViewHoder extends RecyclerView.ViewHolder{
        ImageView mImage;
        TextView mTviewName,mTviewGia,mTviewMota,mTviewDonvi;

        public ItemViewHoder(@NonNull View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.imageview);
            mTviewName = itemView.findViewById(R.id.textviewName);
            mTviewGia = itemView.findViewById(R.id.textviewGia);
            mTviewMota = itemView.findViewById(R.id.textviewMota);
            mTviewDonvi = itemView.findViewById(R.id.donvitien);
        }
        public void bind(int position){

        }
    }
}
