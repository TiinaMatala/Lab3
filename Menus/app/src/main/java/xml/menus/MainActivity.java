package xml.menus;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        View root = findViewById(R.id.main);
        TextView text = findViewById(R.id.colorOfText);
        switch (item.getItemId()) {
            case R.id.red:
                root.setBackgroundColor(Color.parseColor("#FF0000"));
                text.setText("Red");
                return true;
            case R.id.green:
                root.setBackgroundColor(Color.parseColor("#a4c639"));
                text.setText("Green");
                return true;
            case R.id.purple:
                root.setBackgroundColor(Color.parseColor("#ff00ff"));
                text.setText("Purple");
                return true;
            case R.id.yellow:
                root.setBackgroundColor(Color.parseColor("#FFFF00"));
                text.setText("Yellow");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
