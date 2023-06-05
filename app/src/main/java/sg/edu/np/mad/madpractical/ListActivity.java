package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {
    String title = "List Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView pic = (ImageView) findViewById(R.id.imageView2);
        pic.setOnClickListener(view -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            new AlertDialog.Builder(this)
                    .setTitle("Profile")
                    .setMessage("MADness")
                    .setNegativeButton("CLOSE", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    })
                    .setPositiveButton("VIEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent goNext = new Intent(ListActivity.this, MainActivity.class);
                            int random = new Random().nextInt() ;
                            goNext.putExtra("random",random);
                            startActivity(goNext);

                        }
                    }).show();

        });
    }
}