package ksu.ie.insertbybutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtNumber;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnbt, btnpg, btncan, btncor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btnbt = findViewById(R.id.buttonbt);
        btn0 = findViewById(R.id.button0);
        btnpg = findViewById(R.id.buttonpg);
        btncan = findViewById(R.id.buttoncan);
        btncor = findViewById(R.id.buttoncor);
        txtNumber = findViewById(R.id.txtNomor);

        btn1.setOnClickListener(btnListener);
        btn2.setOnClickListener(btnListener);
        btn3.setOnClickListener(btnListener);
        btn4.setOnClickListener(btnListener);
        btn5.setOnClickListener(btnListener);
        btn6.setOnClickListener(btnListener);
        btn7.setOnClickListener(btnListener);
        btn8.setOnClickListener(btnListener);
        btn9.setOnClickListener(btnListener);
        btnbt.setOnClickListener(btnListener);
        btn0.setOnClickListener(btnListener);
        btnpg.setOnClickListener(btnListener);
        btncan.setOnClickListener(btnListener);
        btncor.setOnClickListener(btnListener);

    }

    private View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String textNum = txtNumber.getText().toString();

            switch (view.getId()){
                case R.id.button1:
                    textNum = ""+textNum+"1";
                    break;

                case R.id.button2:
                    textNum = ""+textNum+"2";
                    break;

                case R.id.button3:
                    textNum = ""+textNum+"3";
                    break;

                case R.id.button4:
                    textNum = ""+textNum+"4";
                    break;

                case R.id.button5:
                    textNum = ""+textNum+"5";
                    break;

                case R.id.button6:
                    textNum = ""+textNum+"6";
                    break;

                case R.id.button7:
                    textNum = ""+textNum+"7";
                    break;

                case R.id.button8:
                    textNum = ""+textNum+"8";
                    break;

                case R.id.button9:
                    textNum = ""+textNum+"9";
                    break;

                case R.id.buttonbt:
                    textNum = ""+textNum+"*";
                    break;

                case R.id.button0:
                    textNum = ""+textNum+"0";
                    break;

                case R.id.buttonpg:
                    textNum = ""+textNum+"#";
                    break;

                case R.id.buttoncan:
                    textNum = "";
                    break;

                case R.id.buttoncor:
                    textNum = textNum.substring(0, textNum.length()-1);
                    break;
            }

            txtNumber.setText(textNum);
        }
    };
}