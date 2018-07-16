package com.example.android.newsfeed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        // Find the headline at the given position in the list of news
        News currentNews = getItem(position);

        /* Below I:
         * Find the TextView with view ID title, category, date
         * Use a temp value to store current news' details
         * Set details for display
         */
        TextView titleTextView = listItemView.findViewById(R.id.title_textview);
        String title = currentNews.getmTitle();
        titleTextView.setText(title);

        TextView categoryTextView = listItemView.findViewById(R.id.category_textview);
        String category = currentNews.getmCategory();
        categoryTextView.setText(category);

        TextView dateTextView = listItemView.findViewById(R.id.date_textview);
        String date = currentNews.getmDate();
        dateTextView.setText(date);

        return listItemView;
    }

}