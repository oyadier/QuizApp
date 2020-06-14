package com.example.whatdoyouknow;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;



import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    int correctAnswer ;
    RadioButton button1 , button2,button3,button4,button5,button6,button7,button8,button9,button10;
    RadioButton button11 , button12,button13,button14,button15,button16,button17,button18,button19,button20;
    RadioButton button21 , button22,button23,button24;
    CheckBox checkBox1, checkBox2, checkBox3;
    Button btn9;
    ImageView answerImage;

    public  MediaPlayer mediaPlayer = new MediaPlayer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
builder.setTitle("Quiz Instruction");
builder.setMessage(R.string.instruction);
        initializer();
builder.create().show();
    }
    /*
     * These Question... methods instantly marks the correct
     *  answer for each possible answer selected in each of the questions
     * */
    public void QuestionOne(RadioButton a, RadioButton b, RadioButton c) {
        answerImage = (ImageView) findViewById(R.id.mark_correct);
        if (a.isChecked()) {

            mediaPlayer = MediaPlayer.create(this, R.raw.correct_answer);
            mediaPlayer.start();
            answerImage.setImageResource(R.mipmap.correct_mark);
            correctAnswer ++;

        } else
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong_answer);
            answerImage.setImageResource(R.mipmap.wrong_answer);
            mediaPlayer.start();
        }
        b.setClickable(false);
        a.setClickable(false);
        c.setClickable(false);
    }

    public void QuestionTwo(RadioButton a, RadioButton b, RadioButton c) {
        answerImage = (ImageView) findViewById(R.id.mark_correct2);
        if (c.isChecked()) {

            mediaPlayer = MediaPlayer.create(this, R.raw.correct_answer);
            mediaPlayer.start();
            answerImage.setImageResource(R.mipmap.correct_mark);
            correctAnswer ++;

        } else
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong_answer);
            answerImage.setImageResource(R.mipmap.wrong_answer);
            mediaPlayer.start();
        }
        b.setClickable(false);
        a.setClickable(false);
        c.setClickable(false);

    }

    public void QuestionThree(RadioButton a, RadioButton b, RadioButton c) {
        answerImage = (ImageView) findViewById(R.id.mark_correct3);

        if (b.isChecked()) {

            mediaPlayer = MediaPlayer.create(this, R.raw.correct_answer);
            answerImage.setImageResource(R.mipmap.correct_mark);
            mediaPlayer.start();
            correctAnswer ++;

        } else
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong_answer);
            answerImage.setImageResource(R.mipmap.wrong_answer);
            mediaPlayer.start();
        }
        b.setClickable(false);
        a.setClickable(false);
        c.setClickable(false);

    }

    public void QuestionFour(RadioButton a, RadioButton b, RadioButton c) {
        answerImage = (ImageView) findViewById(R.id.mark_correct4);

        if (b.isChecked()) {

            mediaPlayer = MediaPlayer.create(this, R.raw.correct_answer);
            answerImage.setImageResource(R.mipmap.correct_mark);
            mediaPlayer.start();
            correctAnswer ++;

        } else
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong_answer);
            answerImage.setImageResource(R.mipmap.wrong_answer);
            mediaPlayer.start();
        }
        b.setClickable(false);
        a.setClickable(false);
        c.setClickable(false);

    }

    public void QuestionFive(RadioButton a, RadioButton b, RadioButton c) {
        answerImage = findViewById(R.id.mark_correct5);

        if (c.isChecked()) {

            mediaPlayer = MediaPlayer.create(this, R.raw.correct_answer);
            mediaPlayer.start();
            answerImage.setImageResource(R.mipmap.correct_mark);
            correctAnswer ++;

        } else
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong_answer);
            answerImage.setImageResource(R.mipmap.wrong_answer);
            mediaPlayer.start();
        }
        b.setClickable(false);
        a.setClickable(false);
        c.setClickable(false);

    }

    public void QuestionSix(RadioButton a, RadioButton b, RadioButton c) {
        answerImage = findViewById(R.id.mark_correct6);

        if (c.isChecked()) {

            mediaPlayer = MediaPlayer.create(this, R.raw.correct_answer);
            mediaPlayer.start();
            answerImage.setImageResource(R.mipmap.correct_mark);
            correctAnswer ++;

        } else
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong_answer);
            answerImage.setImageResource(R.mipmap.wrong_answer);
            mediaPlayer.start();
        }
        b.setClickable(false);
        a.setClickable(false);
        c.setClickable(false);

    }

    public void QuestionSeven(RadioButton a, RadioButton b, RadioButton c) {
        answerImage = findViewById(R.id.mark_correct7);

        if (a.isChecked()) {

            mediaPlayer = MediaPlayer.create(this, R.raw.correct_answer);
            mediaPlayer.start();
            answerImage.setImageResource(R.mipmap.correct_mark);
            correctAnswer ++;

        } else
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong_answer);
            answerImage.setImageResource(R.mipmap.wrong_answer);
            mediaPlayer.start();
        }
        b.setClickable(false);
        a.setClickable(false);
        c.setClickable(false);

    }

    public void QuestionEight(RadioButton a, RadioButton b, RadioButton c) {
        answerImage = findViewById(R.id.mark_correct8);

        if (c.isChecked()) {

            mediaPlayer = MediaPlayer.create(this, R.raw.correct_answer);
            mediaPlayer.start();
            answerImage.setImageResource(R.mipmap.correct_mark);
            correctAnswer ++;

        } else
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong_answer);
            mediaPlayer.start();
            answerImage.setImageResource(R.mipmap.wrong_answer);
        }
        b.setClickable(false);
        a.setClickable(false);
        c.setClickable(false);

    }

    public void QuestionNine(Button button)
    {AlertDialog.Builder builder = new AlertDialog.Builder(this);
        String answer ;
        EditText getAnswer = (EditText) findViewById(R.id.user_input);
        answer = getAnswer.getText().toString();

        if (answer.equalsIgnoreCase("Four"))
        {
            builder.setMessage("Question 9) is Correct");
            mediaPlayer = MediaPlayer.create(this, R.raw.correct_answer);
            mediaPlayer.start();
            mediaPlayer.stop();
            correctAnswer++;
        }
        else {
            builder.setMessage("Question 9) is Wrong");
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong_answer);
            mediaPlayer.start();
            mediaPlayer.stop();
        }

        builder.create().show();
    }
    public void QuestionTen(CheckBox a , CheckBox b, CheckBox c) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (b.isChecked()) {
            builder.setMessage("Question 10) is Correct!!");
            correctAnswer++;
        }else
        {
            builder.setMessage("Question 10 is Wrong");
        }
        builder.create().show();
    }

    // displayRemark method displays the marks scored by the student to the student
    public void displayRemark(int number) {
        TextView marks = (TextView) findViewById(R.id.marks);
        marks.setText(number + "" + "/10");
    }
    /*
     * @author Oyadier
     *  This block of codes listens to  each buttons selected in each of the Question Methods.
     * */

    @Override
    public void onClick(View v) {
        int i = v.getId();

        switch (i) {
            case R.id.radio1_A:
            case R.id.radio1_B:
            case R.id.radio1_C:
            {
                QuestionOne(button1,button2,button3);
            }break;
            case R.id.radio2_A:
            case R.id.radio2_B:
            case R.id.radio2_C:
            {
                QuestionTwo(button4, button5,button6);
            }break;

            case R.id.radio3_A:
            case R.id.radio3_B:
            case R.id.radio3_C:
            {
                QuestionThree(button7,button8,button9);
            }break;

            case R.id.radio4_A:
            case R.id.radio4_B:
            case R.id.radio4_C:
            {
                QuestionFour(button10,button11,button12);
            }break;
            case R.id.radio5_A:
            case R.id.radio5_B:
            case R.id.radio5_C:
            {
                QuestionFive(button13,button14,button15);
            }break;
            case R.id.radio6_A:
            case R.id.radio6_B:
            case R.id.radio6_C:
            {
                QuestionSix(button16,button17,button18);
            }break;
            case R.id.radio7_A:
            case R.id.radio7_B:
            case R.id.radio7_C:
            {
                QuestionSeven(button19,button20,button21);
            }break;
            case R.id.radio8_A:
            case R.id.radio8_B:
            case R.id.radio8_C:
            {
                QuestionEight(button22,button23,button24);
            }break;
            case R.id.mark:
            {
                QuestionNine(btn9);
            }break;

            case R.id.checkA:
            case R.id.checkB:
            case R.id.checkC: {
                QuestionTen(checkBox1,checkBox2,checkBox3);
                Remarks(correctAnswer);
            }break;
            case R.id.restart_all_questoin:
            {
                RestartQuiz();
            }break;
            default:
        }
        displayRemark(correctAnswer);

    }


    //This method restart the quiz. And again set all the radio buttons to clickable

    private void RestartQuiz(){
        RadioGroup question1 = (RadioGroup) findViewById(R.id.radio1);
        RadioGroup question2 = (RadioGroup) findViewById(R.id.radio2);
        RadioGroup question3 = (RadioGroup) findViewById(R.id.radio3);
        RadioGroup question4 = (RadioGroup) findViewById(R.id.radio4);
        RadioGroup question5 = (RadioGroup) findViewById(R.id.radio5);
        RadioGroup question6 = (RadioGroup) findViewById(R.id.radio6);
        RadioGroup question7 = (RadioGroup) findViewById(R.id.radio7);
        RadioGroup question8= (RadioGroup) findViewById(R.id.radio8);
        CheckBox question10 = (CheckBox) findViewById(R.id.checkbox);

        //Claring all the radioGroups
        question1.clearCheck(); question2.clearCheck(); question3.clearCheck(); question4.clearCheck(); question5.clearCheck();
        question6.clearCheck(); question7.clearCheck(); question8.clearCheck();

        //Resetting all the child buttons to clickable
        button1.setClickable(true);button2.setClickable(true);button3.setClickable(true);button4.setClickable(true);
        button5.setClickable(true);button6.setClickable(true);button7.setClickable(true);button8.setClickable(true);
        button9.setClickable(true);button10.setClickable(true);button11.setClickable(true);button12.setClickable(true);
        button13.setClickable(true);button14.setClickable(true);button15.setClickable(true);button16.setClickable(true);
        button17.setClickable(true);button18.setClickable(true);button19.setClickable(true);button20.setClickable(true);
        button21.setClickable(true);button22.setClickable(true);button23.setClickable(true);button24.setClickable(true);
        checkBox1.setClickable(true); checkBox2.setClickable(true); checkBox3.setClickable(true);

        // Setting the user score to zero;
        correctAnswer = 0;
    }

    public void initializer ()
    {
        Button restart = (Button) findViewById(R.id.restart_all_questoin);
        button1 = (RadioButton) findViewById(R.id.radio1_A);
        button2 = (RadioButton) findViewById(R.id.radio1_B);
        button3 = findViewById(R.id.radio1_C); button4 = findViewById(R.id.radio2_A); button5 = findViewById(R.id.radio2_B);
        button6 = findViewById(R.id.radio2_C); button7 = findViewById(R.id.radio3_A);button8 = findViewById(R.id.radio3_B);
        button9 = findViewById(R.id.radio3_C);button10 = findViewById(R.id.radio4_A);button11 = findViewById(R.id.radio4_B);
        button12 = findViewById(R.id.radio4_C); button13 = findViewById(R.id.radio5_A);button14 = findViewById(R.id.radio5_B);
        button15 = findViewById(R.id.radio5_C);button16 = findViewById(R.id.radio6_A);button17 = findViewById(R.id.radio6_B);
        button18 = findViewById(R.id.radio6_C);button19 = findViewById(R.id.radio7_A);button20 = findViewById(R.id.radio7_B);
        button21 = findViewById(R.id.radio7_C);button22 = findViewById(R.id.radio8_A);button23 = findViewById(R.id.radio8_B);
        button24 = findViewById(R.id.radio8_C);

// Casting the xml CheckBox id into Java Checkbox buttons
        checkBox1 = findViewById(R.id.checkA);
        checkBox2 = findViewById(R.id.checkB);
        checkBox3 = findViewById(R.id.checkC);
// Casting the xml Button id into Java Button;
        btn9 = findViewById(R.id.mark);
        /*
         *Setting the onClickListener context for all the buttons
         */
        button1.setOnClickListener(this); button2.setOnClickListener(this);button3.setOnClickListener(this);
        button4.setOnClickListener(this); button5.setOnClickListener(this);button6.setOnClickListener(this);
        button7.setOnClickListener(this);button8.setOnClickListener(this);button9.setOnClickListener(this);
        button10.setOnClickListener(this);button11.setOnClickListener(this);button12.setOnClickListener(this);
        button13.setOnClickListener(this);button14.setOnClickListener(this);button15.setOnClickListener(this);
        button16.setOnClickListener(this);button17.setOnClickListener(this);button18.setOnClickListener(this);
        button19.setOnClickListener(this);button20.setOnClickListener(this);button21.setOnClickListener(this);
        button22.setOnClickListener(this);button23.setOnClickListener(this);button24.setOnClickListener(this);
        checkBox1.setOnClickListener(this);
        checkBox2.setOnClickListener(this);
        checkBox3.setOnClickListener(this);
        restart.setOnClickListener(this);
        btn9.setOnClickListener(this);
    }

    /*
     * This method gives remarks/feedback to the student. The code checks if the user's
     * score is less than or greater than 5.
     * */
    private void Remarks (int score)
    {AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (score< 5){
            builder.setTitle("Poor Performance");
            builder.setMessage("Your performance is not acceptable. Press Ok to start or Cancel to cancel");
            builder.setPositiveButton("Ok" ,new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    RestartQuiz();
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
        }else {
            builder.setTitle("Congratulations");
            builder.setMessage("Your performance is exceptional."+ correctAnswer + " out of 10? Press Ok to Restart or Cancel to Exit the Quiz");
            builder.setPositiveButton("Ok" ,new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    RestartQuiz();
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }});}
        builder.setCancelable(false);
        builder.create().show();
    }
}




