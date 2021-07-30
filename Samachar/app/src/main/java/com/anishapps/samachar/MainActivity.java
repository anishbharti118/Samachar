package com.anishapps.samachar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.anishapps.samachar.topheadlines.TopHeadlinesAdapter;
import com.anishapps.samachar.topheadlines.TopHeadlinesModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView topHeadlinesRecyclerView;

    private TopHeadlinesAdapter topHeadlinesAdapter;
    private List<TopHeadlinesModel> topHeadlinesModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topHeadlinesRecyclerView=findViewById(R.id.top_headlines_recyclerview);

        topHeadlinesModelList.add(new TopHeadlinesModel("News1","Desc1","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News2","Desc2","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News1","Desc1","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News2","Desc2","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News1","Desc1","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News2","Desc2","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News1","Desc1","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News2","Desc2","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News1","Desc1","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News2","Desc2","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News1","Desc1","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News2","Desc2","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News1","Desc1","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News2","Desc2","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News1","Desc1","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News2","Desc2","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News1","Desc1","Source"));
        topHeadlinesModelList.add(new TopHeadlinesModel("News2","Desc2","Source"));

        topHeadlinesAdapter = new TopHeadlinesAdapter(topHeadlinesModelList,this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        topHeadlinesRecyclerView.setLayoutManager(layoutManager);
        topHeadlinesRecyclerView.setAdapter(topHeadlinesAdapter);
        topHeadlinesAdapter.notifyDataSetChanged();

    }
}