package com.example.shining.p002_glide420;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.shining.p002_glide420.glide420.adapter.NineImageViewEventAdapter;
import com.example.shining.p002_glide420.glide420.commonutil.ModelUtil;
import com.example.shining.p002_glide420.glide420.domain.ImageAttr;
import com.example.shining.p002_glide420.glide420.domain.ImageModel;
import com.example.shining.p002_glide420.glide420.view.NineImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shining on 2017/11/15.
 */

public class MainActivityImage extends AppCompatActivity {

    private TextView tvTitle;
    private NineImageView nineImageView;
    private List<ImageModel> list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_image);
        findview();
        onclicklistener();
        donetwork();
    }

    private void donetwork() {
        //数据源bufen
        list = ModelUtil.getImages();
        tvTitle.setText(list.get(0).getTitle());
        //九张图片bufen
        ArrayList<ImageAttr> imageAttrs = new ArrayList<>();
        for (String url : list.get(0).getImages()) {
            ImageAttr attr = new ImageAttr();
            attr.url = url;
            imageAttrs.add(attr);
        }
        if (nineImageView.getAdapter() != null) {
            nineImageView.setAdapter(nineImageView.getAdapter());
        } else {
            nineImageView.setAdapter(new NineImageViewEventAdapter(nineImageView.getContext(), imageAttrs));
        }
    }


    private void findview() {
        tvTitle = (TextView) findViewById(R.id.tv_title);
        nineImageView = (NineImageView) findViewById(R.id.nineImageView);
        nineImageView.setVis_more(true);
    }


    private void onclicklistener() {

    }

    @Override
    public void finish() {
        super.finish();
//        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}
