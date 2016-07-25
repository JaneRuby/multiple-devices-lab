package generalassembly.yuliyakaleda.supportdifferentdevices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  private TextView text;
  private Button button;
  private ImageView image;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // The system will choose which version of activity_main.xml to use (regular or landscape mode)
    setContentView(R.layout.activity_main);

    text = (TextView) findViewById(R.id.text_view);
    image = (ImageView) findViewById(R.id.image);
    button = (Button) findViewById(R.id.button);
    button.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    // Update the text in the TextView when the button is clicked.
    // Use your strings.xml rather than a hardcoded string! The system will choose which version
    // of strings.xml to use based on what language the user has set on their device.
    text.setText(R.string.answer);

    // Change the button's icon when the button is clicked.
    // This icon was generated as a new vector asset (File > New > Vector Asset) and saved in the
    // drawable folder
    image.setBackgroundResource(R.drawable.ic_insert_emoticon_40dp);
  }
}
