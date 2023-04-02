package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputText;
    TextView outText;
    Button buttonText;


    // создание поля для алгоритма
    private String mass = ""; // переменная для записи входного значения

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.input);
        outText = findViewById(R.id.out);
        buttonText = findViewById(R.id.button);

        // выполнение действий при нажании кнопки
        buttonText.setOnClickListener(listener); // обработка нажатия кнопки
    }

    // объект обработки нажатия кнопки
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // считывание введённого значения
            mass = inputText.getText().toString();

            // вывод полученной информации на экран
            outText.setText("Для вывоза этого груза на орбиту Марса понадобиться топлива "
                    + CalculatonMars.calculation(Double.parseDouble(mass)) + " килограмм");
        }

    };
}