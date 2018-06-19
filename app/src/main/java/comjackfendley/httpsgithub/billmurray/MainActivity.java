package comjackfendley.httpsgithub.billmurray;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView hOptionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hOptionsList = (ListView) findViewById(R.id.lv_options);

        String[] options = new String[]{"Top 10 Movies", "Personal Life", "Further Reading"};

        //To use an array as the options for a ListView, we need an ArrayAdapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
            {
                Intent movieIntent = new Intent( MainActivity.this, MovieCategoryActivity.class);
                Intent personalLifeIntent = new Intent(MainActivity.this, PersonalLifeCategory.class);
                Intent furtherIntent = new Intent(MainActivity.this, FurtherReading.class);


                if( position == 0)
                {
                    startActivity( movieIntent );
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                }
                if( position == 1)
                {
                    startActivity(personalLifeIntent);
                }
                if(position == 2)
                {
                    startActivity(furtherIntent);
                }

            }
        };

        hOptionsList.setAdapter(arrayAdapter);
        hOptionsList.setOnItemClickListener(itemClickListener);



    }
    
}
