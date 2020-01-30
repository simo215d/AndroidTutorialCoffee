package com.example.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private int coffee=0;
    private double coffeePrice=2.5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addCoffee(View view){
        coffee++;
        displayQuantity();
    }

    public void subtractCoffee(View view){
        if (coffee>0)
        coffee--;
        displayQuantity();
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        displayPrice();
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity() {
        TextView quantityTextView = (TextView) findViewById(R.id.quantityNumber);
        quantityTextView.setText("" + coffee);
    }

    private void displayPrice(){
        String sumPrice=NumberFormat.getCurrencyInstance().format(coffee*coffeePrice);
        String message="Total: "+sumPrice;
        TextView textView = (TextView) findViewById(R.id.priceNumber);
        textView.setText(message);
    }
}