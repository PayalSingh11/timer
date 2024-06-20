package com.ep.timerfinal;

import static android.app.ProgressDialog.show;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private int duration = 120;
    private boolean timerRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        final TextView hours = findViewById(R.id.hours);
        final TextView min = findViewById(R.id.min);
        final TextView sec = findViewById(R.id.sec);
        final AppCompatButton bt1 = findViewById(R.id.bt1);
        final AppCompatButton bt2 = findViewById(R.id.bt2);
        final AppCompatButton bt3 = findViewById(R.id.bt3);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!timerRunning) {
                    timerRunning = true;
                    new CountDownTimer(duration * 1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    String time = String.format(Locale.getDefault(), "%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                                            TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) -
                                                    TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                                            TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)), Locale.getDefault());
                                    final String[] hourMinSec = time.split(":");
                                    hours.setText(hourMinSec[0]);
                                    min.setText(hourMinSec[1]);
                                    sec.setText(hourMinSec[2]);


                                }
                            });

                        }

                        @Override
                        public void onFinish() {
                            duration = 120;
                            timerRunning =false;

                        }
                    }.start();

                } else {
                    Toast.makeText(MainActivity.this, "timer is already running", Toast.LENGTH_SHORT).show();

                }


            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!timerRunning) {
                    timerRunning = true;
                    new CountDownTimer(duration * 1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    String time = String.format(Locale.getDefault(), "%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                                            TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) -
                                                    TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                                            TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)), Locale.getDefault());
                                    final String[] hourMinSec = time.split(":");
                                    hours.setText(hourMinSec[0]);
                                    min.setText(hourMinSec[1]);
                                    sec.setText(hourMinSec[2]);


                                }
                            });

                        }

                        @Override
                        public void onFinish() {
                            duration = 120;
                            timerRunning =false;

                        }
                    }.start();

                } else {
                    Toast.makeText(MainActivity.this, "timer is already running", Toast.LENGTH_SHORT).show();

                }


            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!timerRunning) {
                    timerRunning = true;
                    new CountDownTimer(duration * 1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    String time = String.format(Locale.getDefault(), "%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                                            TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) -
                                                    TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                                            TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)), Locale.getDefault());
                                    final String[] hourMinSec = time.split(":");
                                    hours.setText(hourMinSec[0]);
                                    min.setText(hourMinSec[1]);
                                    sec.setText(hourMinSec[2]);


                                }
                            });

                        }

                        @Override
                        public void onFinish() {
                            duration = 120;
                            timerRunning =false;

                        }
                    }.start();

                } else {
                    Toast.makeText(MainActivity.this, "timer is already running", Toast.LENGTH_SHORT).show();

                }


            }
        });
    }
}

