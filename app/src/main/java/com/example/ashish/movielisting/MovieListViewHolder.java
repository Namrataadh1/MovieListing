package com.example.ashish.movielisting;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ashish.movielisting.rest.response.Result;

/**
 * Created by ashish on 7/12/2016.
 */
public class MovieListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ;
    public TextView tvMovieTitle,tvMovieRatings,tvmovieReleaseDate;
    public ImageView ivMovieImage;

    Result movieDetail;


    public MovieListViewHolder(View itemView) {
        super(itemView);

        tvMovieTitle = (TextView) itemView.findViewById(R.id.movie_title);
        tvMovieRatings = (TextView) itemView.findViewById(R.id.movie_ratings);
        tvmovieReleaseDate = (TextView) itemView.findViewById(R.id.movie_releasedate);
        ivMovieImage = (ImageView) itemView.findViewById(R.id.movie_image);

        movieDetail = (Result)  tvMovieTitle.getTag();



        itemView.setOnClickListener( this);
    }

    @Override
    public void onClick(View view) {
        Intent movieDetailActivityIntent = new Intent(view.getContext(), DetailActivity.class);
        movieDetailActivityIntent.putExtra("Movie_Detail", movieDetail);
        view.getContext().startActivity(movieDetailActivityIntent);


    }
}
