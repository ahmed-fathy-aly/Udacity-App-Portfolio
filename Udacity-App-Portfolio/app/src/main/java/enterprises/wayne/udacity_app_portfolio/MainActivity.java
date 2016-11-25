package enterprises.wayne.udacity_app_portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * displays a set of buttons each leading to an app
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button_popular_movies,
            R.id.button_stock_hawk,
            R.id.button_build_it_bigger,
            R.id.button_make_your_app_material,
            R.id.button_go_ubiquitous,
            R.id.button_capstone})
    public void onButtonProjectClicked(View view) {
        // choose the project name
        String projectName = "";
        switch (view.getId()) {
            case R.id.button_popular_movies:
                projectName = getString(R.string.popular_movies);
                break;
            case R.id.button_stock_hawk:
                projectName = getString(R.string.stock_hawk);
                break;
            case R.id.button_build_it_bigger:
                projectName = getString(R.string.build_it_bigger);
                break;
            case R.id.button_make_your_app_material:
                projectName = getString(R.string.make_your_app_material);
                break;
            case R.id.button_go_ubiquitous:
                projectName = getString(R.string.go_ubiquitous);
                break;
            case R.id.button_capstone:
                projectName = getString(R.string.capstone);
                break;
        }

        // display the toast
        String message = getString(R.string.you_selected_x, projectName);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
