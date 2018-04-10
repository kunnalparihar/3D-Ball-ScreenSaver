package com.example.kunal.tictactoe;

import android.content.ComponentName;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView textView1;
    Button button02,button03,button04,button05,button06,button07,button08,button09,button010,button011,button012;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=(TextView)findViewById(R.id.textView2) ;
        button02=(Button)findViewById(R.id.button2);
        button03=(Button)findViewById(R.id.button3);
        button04=(Button)findViewById(R.id.button4);
        button05=(Button)findViewById(R.id.button5);
        button06=(Button)findViewById(R.id.button6);
        button07=(Button)findViewById(R.id.button7);
        button08=(Button)findViewById(R.id.button8);
        button09=(Button)findViewById(R.id.button9);
        button010=(Button)findViewById(R.id.button10);
        button011=(Button)findViewById(R.id.button11);

    }
    static int flag=0;
    public  void check()
    {
        String a = (String) button02.getText();
        String b = (String) button03.getText();
        String c = (String) button04.getText();
        String d = (String) button05.getText();
        String e= (String) button06.getText();
        String f = (String) button07.getText();
        String g = (String) button08.getText();
        String h = (String) button09.getText();
        String i = (String) button010.getText();

        if(a.equals(b)&b.equals(c))
        { if(!a.equals(""))
        { textView1.setText("you won");
        button011.setVisibility(View.VISIBLE);
            button011.setClickable(true);
        }
        }
        if(d.equals(e)&e.equals(f))
    {if(!d.equals(""))
    {   textView1.setText("you won");
        button011.setVisibility(View.VISIBLE);
        button011.setClickable(true);
    }

    }
    if(g.equals(h)&h.equals(i))
    {if(!g.equals(""))
    { textView1.setText("you won");button011.setVisibility(View.VISIBLE);
        button011.setClickable(true);
    }

    }
    if(c.equals(e)&e.equals(g))
    {if(!c.equals(""))
    { textView1.setText("you won");
        button011.setVisibility(View.VISIBLE);
        button011.setClickable(true);
    }

    }
    if(a.equals(e)&e.equals(i))
    {if(!a.equals(""))
    { textView1.setText("you won");
        button011.setVisibility(View.VISIBLE);
        button011.setClickable(true);
    }

    }
    if(c.equals(f)&f.equals(i))
    {if(!c.equals(""))
    { textView1.setText("you won");
        button011.setVisibility(View.VISIBLE);
        button011.setClickable(true);
    }

    }
    if(a.equals(d)&d.equals(g))
    {if(!a.equals(""))
    {  textView1.setText("you won");
        button011.setVisibility(View.VISIBLE);
        button011.setClickable(true);
    }

    }
    if(b.equals(e)&e.equals(h))
    {if(!b.equals(""))
    {  textView1.setText("you won");
        button011.setVisibility(View.VISIBLE);
        button011.setClickable(true);
    }

    }

    }
    public  void task(View view) {
        button012=(Button)findViewById(view.getId());

        if(button012.getText().equals("")) {

            int blue = 0;
        if (flag == 0) {
            button012.setText("0");
            blue++;

        } else {
            button012.setText("X");
        }
        flag = blue;
            check();
         }
    }
    public void playAgain(View view)
    {
        button02.setText("");
        button03.setText("");
        button04.setText("");
        button05.setText("");
        button06.setText("");
        button07.setText("");
        button08.setText("");
        button09.setText("");
        button010.setText("");
        textView1.setText("Play Game");


    }



}
