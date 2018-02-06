package com.example.shining.p002_glide420.glide420.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.example.shining.p002_glide420.glide420.domain.ImageAttr;
import com.example.shining.p002_glide420.glide420.view.ImageViewWrapper;
import com.example.shining.p002_glide420.glide420.view.NineImageView;

import java.io.Serializable;
import java.util.List;

public abstract class NineImageViewAdapter implements Serializable {

    protected Context context;
    private List<ImageAttr> imageAttrs;

    public NineImageViewAdapter(Context context, List<ImageAttr> images) {
        this.context = context;
        this.imageAttrs = images;
    }

    public void onImageItemClick(Context context, NineImageView nineImageView, int index, List<ImageAttr> images) {
    }

    public ImageView generateImageView(Context context) {
        ImageViewWrapper imageView = new ImageViewWrapper(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    public List<ImageAttr> getImageAttrs() {
        return imageAttrs;
    }

    public void setImageAttrs(List<ImageAttr> images) {
        this.imageAttrs = images;
    }
}