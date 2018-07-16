package com.example.android.newsfeed;

public class News {
    private String mTitle;
    private String mDate;
    private String mCategory;
    private String mUrl;

    public News(String title, String date, String category, String url) {
       mTitle = title;
       mDate = date;
       mCategory = category;
       mUrl = url;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmCategory() {
        return mCategory;
    }

    public String getmUrl() {
        return mUrl;
    }
}