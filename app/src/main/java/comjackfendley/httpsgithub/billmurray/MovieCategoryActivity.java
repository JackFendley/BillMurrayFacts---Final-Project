package comjackfendley.httpsgithub.billmurray;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by j.fendley on 6/7/2018.
 */

public class MovieCategoryActivity extends AppCompatActivity {
    private ListView cMoviesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_category);

        cMoviesList = (ListView) findViewById(R.id.lv_movies);

        ArrayAdapter<MurrayMovie> arrayAdapter = new ArrayAdapter<MurrayMovie>(this, android.R.layout.simple_list_item_1, MurrayMovie.movies);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
            {
                Intent movieIntent = new Intent( MovieCategoryActivity.this, MoviesActivity.class );

                movieIntent.putExtra( MoviesActivity.EXTRA_MOVIENO, position );

                startActivity(movieIntent);
                overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left);
            }

        };

        cMoviesList.setAdapter(arrayAdapter);
        cMoviesList.setOnItemClickListener(itemClickListener);
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}
