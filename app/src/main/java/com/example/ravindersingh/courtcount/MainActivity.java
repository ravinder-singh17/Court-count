package com.example.ravindersingh.courtcount;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamA(scoreB);
    }
    public void pointA1(View view){
        scoreA+=1;
        displayForTeamA(scoreA);
    }
    public void pointA2(View view){
        scoreA+=2;
        displayForTeamA(scoreA);
    }
    public void pointA3(View view){
        scoreA+=3;
        displayForTeamA(scoreA);
    }
    public void pointB1(View view){
        scoreB+=1;
        displayForTeamB(scoreB);
    }
    public void pointB2(View view){
        scoreB+=2;
        displayForTeamB(scoreB);
    }
    public void pointB3(View view){
        scoreB+=3;
        displayForTeamB(scoreB);
    }
    public void resetScore(View view){
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
    protected void displayForTeamA(int scoreA){
        TextView t = (TextView) findViewById(R.id.team_a_score);
        t.setText(Integer.toString(scoreA));
    }
    protected void displayForTeamB(int scoreB){
        TextView t = (TextView) findViewById(R.id.team_b_score);
        t.setText(Integer.toString(scoreB));
    }
}
