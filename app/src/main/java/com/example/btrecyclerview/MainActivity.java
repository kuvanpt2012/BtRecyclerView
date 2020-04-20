package com.example.btrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.TreeMap;


public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerviewUsers;
    UserAdapter mUserAdapter;
    ArrayList<User> mUserArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerviewUsers = findViewById(R.id.recyclerview);
        mUserArrayList = new ArrayList<>();
        mUserAdapter = new UserAdapter();
        mRecyclerviewUsers.setHasFixedSize(true);
        mRecyclerviewUsers.setItemViewCacheSize(20);
        mRecyclerviewUsers.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        mRecyclerviewUsers.setAdapter(mUserAdapter);


        mUserArrayList.add(new User("thịt kho hột vịt","trứng kho hột vịt là ",R.mipmap.ic_launcher,200000,"VNĐ"));
        mUserArrayList.add(new User("đậu hủ dồn thịt","đậu hủ dồn thịt là trứng và hột vịt",R.mipmap.ic_launcher,200000,"VNĐ"));
        mUserArrayList.add(new User("cơm trứng chiên","cơm trứng chiên là trứng và hột vịt",R.mipmap.ic_launcher,200000,"VNĐ"));
        mUserArrayList.add(new User("cơm trứng chiên","cơm trứng chiên là trứng và hột vịt",R.mipmap.ic_launcher,200000,"VNĐ"));
        mUserArrayList.add(new User("cơm trứng chiên","cơm trứng chiên là trứng và hột vịt",R.mipmap.ic_launcher,200000,"VNĐ"));
        mUserArrayList.add(new User("cơm trứng chiên","cơm trứng chiên là trứng và hột vịt",R.mipmap.ic_launcher,200000,"VNĐ"));
        mUserArrayList.add(new User("cơm trứng chiên","cơm trứng chiên là trứng và hột vịt",R.mipmap.ic_launcher,200000,"VNĐ"));
        mUserArrayList.add(new User("cơm trứng chiên","cơm trứng chiên là trứng và hột vịt",R.mipmap.ic_launcher,200000,"VNĐ"));
        mUserArrayList.add(new User("cơm trứng chiên","cơm trứng chiên là trứng và hột vịt",R.mipmap.ic_launcher,200000,"VNĐ"));

        mUserAdapter.submitData(mUserArrayList);

    }
}
