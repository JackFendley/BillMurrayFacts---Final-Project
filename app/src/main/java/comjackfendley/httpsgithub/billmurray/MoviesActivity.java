package comjackfendley.httpsgithub.billmurray;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by j.fendley on 6/1/2018.
 */

public class MoviesActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIENO = "movieNo";

    private ImageView mMoviePhoto;
    private TextView mMovieName;
    private TextView mMovieDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        int movieNo = (Integer)getIntent().getExtras().get(EXTRA_MOVIENO);

        mMoviePhoto = (ImageView) findViewById(R.id.iv_movie);
        mMovieName = (TextView) findViewById(R.id.tv_name);
        mMovieDescription = (TextView) findViewById(R.id.tv_description);

        MurrayMovie movie = MurrayMovie.movies[movieNo];

        mMoviePhoto.setImageResource( movie.getImageResourceId());

        mMoviePhoto.setContentDescription( movie.getName());

        mMovieName.setText(movie.getName());

        mMovieDescription.setText( movie.getDescription());
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();

        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}


