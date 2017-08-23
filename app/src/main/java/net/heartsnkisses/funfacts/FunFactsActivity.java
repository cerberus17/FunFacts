package net.heartsnkisses.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {
  private RelativeLayout mRelativeLayout;
  private TextView mFactTextView;
  private Button mShowFactButton;

  private FactBook mFactBook = new FactBook();
  private ColorWheel mColorWheel = new ColorWheel();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fun_facts);

    mRelativeLayout = (RelativeLayout) findViewById(R.id.factLayout);
    mFactTextView = (TextView) findViewById(R.id.factTextView);
    mShowFactButton = (Button) findViewById(R.id.showFactButton);

    mShowFactButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        mFactTextView.setText(mFactBook.getFact());
        int newColor = mColorWheel.getColor();
        mRelativeLayout.setBackgroundColor(newColor);
        mShowFactButton.setTextColor(newColor);
      }
    });
  }
}
