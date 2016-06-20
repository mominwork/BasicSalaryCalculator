package com.example.home.labtest1setb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText basicSalaryET;
    EditText medicalET;
    EditText houseRentET;
    EditText totalSalaryET;

    Button calculateBT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

}


    public void initialize() {

        basicSalaryET = (EditText) findViewById(R.id.basicSalaryViewET);
        medicalET = (EditText) findViewById(R.id.medicalViewET);
        houseRentET = (EditText) findViewById(R.id.houseRentViewET);

        calculateBT = (Button) findViewById(R.id.calculateViewBT);

        totalSalaryET = (EditText) findViewById(R.id.totalSalaryViewET);

    }

    public void calculate(View view) {

        double basicSalary = Double.parseDouble(basicSalaryET.getText().toString());
        float medical = Float.parseFloat(medicalET.getText().toString());
        float houseRent = Float.parseFloat(houseRentET.getText().toString());

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        salaryCalculator.setBasicSalary(basicSalary);
        salaryCalculator.setMedical(medical);
        salaryCalculator.setHouseRent(houseRent);


        totalSalaryET.setText(String.valueOf(salaryCalculator.calculateTotalSalary()));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
}
