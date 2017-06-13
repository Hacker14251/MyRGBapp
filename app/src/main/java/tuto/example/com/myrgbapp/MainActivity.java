package tuto.example.com.myrgbapp;


        import android.graphics.Color;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.LinearLayout;

        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int minteger = 0;
    int minteger1 = 0;
    int minteger2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout ahmad = (LinearLayout) findViewById(R.id.nizam);
        ahmad.setBackgroundColor(Color.rgb(minteger, minteger1, minteger2));

    }

    public void increaseInteger(View view) {
        if (minteger < 245) {
            minteger = minteger + 10;
            display(minteger);
        } else {
            minteger = 0;
            display(minteger);

        }
        LinearLayout ahmad = (LinearLayout) findViewById(R.id.nizam);
        ahmad.setBackgroundColor(Color.rgb(minteger, minteger1, minteger2));
    }

    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number);
        displayInteger.setText("Integer: " + number);
    }

    public void increaseInteger1(View view) {
        if (minteger1 < 245) {
            minteger1 = minteger1 + 10;
            display1(minteger1);
        } else {
            minteger1 = 0;
            display1(minteger1);
        }
        LinearLayout ahmad = (LinearLayout) findViewById(R.id.nizam);
        ahmad.setBackgroundColor(Color.rgb(minteger, minteger1, minteger2));
    }

    private void display1(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number1);
        displayInteger.setText("Integer: " + number);
    }

    public void increaseInteger2(View view) {
        if (minteger2 < 245) {
            minteger2 = minteger2 + 10;
            display2(minteger2);
        } else {
            minteger2 = 0;
            display2(minteger2);
        }
        LinearLayout ahmad = (LinearLayout) findViewById(R.id.nizam);
        ahmad.setBackgroundColor(Color.rgb(minteger, minteger1, minteger2));
    }

    private void display2(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number2);
        displayInteger.setText("Integer: " + number);
    }
}