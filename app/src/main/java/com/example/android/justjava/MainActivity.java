package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    public int numberOfCoffees = 0;
    int price = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        displayPrice(numberOfCoffees * price);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void decrementOrder(View view) {
        TextView decrementOrder = (TextView) findViewById(R.id.decrement_button_view);
        numberOfCoffees = numberOfCoffees - 1;
        if (numberOfCoffees > 0) {
            display(numberOfCoffees - 1);
        } else
            display(numberOfCoffees);
    }

    public void incrementOrder(View view) {
        TextView incrementOrder = (TextView) findViewById(R.id.decrement_button_view);
        numberOfCoffees = numberOfCoffees + 1;
        display(numberOfCoffees);
    }
}