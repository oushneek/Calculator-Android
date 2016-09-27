package com.oushneek.assign05;

import android.os.Bundle;
import android.app.Activity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import android.widget.Toast;


public class MainActivity extends Activity{

	String show="";
	int result=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);	
	
		final TextView input=(TextView)findViewById(R.id.textView1);
		input.setMovementMethod(new ScrollingMovementMethod());
		//input.setSelected(true);
		final TextView result=(TextView)findViewById(R.id.textView2);
		
		
		Button one=(Button)findViewById(R.id.one);
		Button two=(Button)findViewById(R.id.two);
		Button three=(Button)findViewById(R.id.three);
		Button four=(Button)findViewById(R.id.four);
		Button five=(Button)findViewById(R.id.five);
		Button six=(Button)findViewById(R.id.six);
		Button seven=(Button)findViewById(R.id.seven);
		Button eight=(Button)findViewById(R.id.eight);
		Button nine=(Button)findViewById(R.id.nine);
		Button zero=(Button)findViewById(R.id.zero);
		Button plus=(Button)findViewById(R.id.plus);
		Button minus=(Button)findViewById(R.id.minus);
		Button mul=(Button)findViewById(R.id.mul);
		Button div=(Button)findViewById(R.id.div);
		Button equal=(Button)findViewById(R.id.equal);
		Button back=(Button)findViewById(R.id.back);
		
		one.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				//Toast.makeText(MainActivity.this, "one working", 10000).show();
				char a='1';
				String str=addchar(a);
				input.setText(str);
			}
		});
		two.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "2 working", 10000).show();
				char a='2';
				String str=addchar(a);
				input.setText(str);
			}
		});
		three.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "3 working", 10000).show();
				char a='3';
				String str=addchar(a);
				input.setText(str);
			}
		});
		four.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "4 working", 10000).show();
				char a='4';
				String str=addchar(a);
				input.setText(str);
			}
		});
		five.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			//	Toast.makeText(MainActivity.this, "5 working", 10000).show();
				char a='5';
				String str=addchar(a);
				input.setText(str);
			}
		});
		six.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "6 working", 10000).show();
				char a='6';
				String str=addchar(a);
				input.setText(str);
			}
		});
		seven.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "7 working", 10000).show();
				char a='7';
				String str=addchar(a);
				input.setText(str);
			}
		});
		eight.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "8 working", 10000).show();
				char a='8';
				String str=addchar(a);
				input.setText(str);
			}
		});
		nine.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "9 working", 10000).show();
				char a='9';
				String str=addchar(a);
				input.setText(str);
			}
		});
		zero.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			//	Toast.makeText(MainActivity.this, "0 working", 10000).show();
				char a='0';
				String str=addchar(a);
				input.setText(str);
			}
		});
		plus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "+ working", 10000).show();
				char a='+';
				String str=addchar(a);
				input.setText(str);
			}
		});
		minus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "- working", 10000).show();
				char a='-';
				String str=addchar(a);
				input.setText(str);
			}
		});
		mul.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "* working", 10000).show();
				char a='*';
				String str=addchar(a);
				input.setText(str);
			}
		});
		div.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "/ working", 10000).show();
				char a='/';
				String str=addchar(a);
				input.setText(str);
			}
		});
		equal.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			//	Toast.makeText(MainActivity.this, "= working", 10000).show();
				
				char a='=';
				String str=addchar(a);
				input.setText(str);
				
				delchar();
				
				int i,sc=1,nc=0,resNum = 0;
				String resStr;

				int numInt[]=new int[show.length()];
				char signStr[]=new char[show.length()];
				numInt[nc]=0;
				signStr[0]=' ';
				for(i=0;i<show.length();i++){
					char c=show.charAt(i);
					if(c>='0' && c<='9'){
						numInt[nc]=numInt[nc]*10+(c-'0');
						//Toast.makeText(MainActivity.this, "c is integer", 10000).show();
					}
					else if(c=='+' || c=='-' || c=='*' || c=='/'){
						//Toast.makeText(MainActivity.this, "value "+numInt[nc], 10000).show();
						nc++;
						numInt[nc]=0;
						nc++;
						numInt[nc]=0;
						signStr[sc]=c;
						sc++;
						signStr[sc]=' ';
						sc++;
						
					}
				}
				sc-=2;
				int tmp=0;
				for(i=1;i<=sc;){
					if(signStr[i]=='*'){
						tmp=numInt[i-1]*numInt[i+1];
						numInt[i-1]=tmp;
						for(int j=i;j<=sc-2;j++){
							signStr[j]=signStr[j+2];
							j++;
							numInt[j]=numInt[j+2];
						}
						sc-=2;
					}
					else
						i++;
				}
				
				for(i=1;i<=sc;){
					if(signStr[i]=='/'){
						//Toast.makeText(MainActivity.this, "value "+numInt[i-1], 10000).show();
						tmp=numInt[i-1]/numInt[i+1];
						numInt[i-1]=tmp;
						for(int j=i;j<=sc-2;j++){
							signStr[j]=signStr[j+2];
							j++;
							numInt[j]=numInt[j+2];
						}
						sc-=2;
					}
					else
						i++;
				}
				
				for(i=1;i<=sc;){
					if(signStr[i]=='-'){
						tmp=numInt[i-1]-numInt[i+1];
						numInt[i-1]=tmp;
						for(int j=i;j<=sc-2;j++){
							signStr[j]=signStr[j+2];
							j++;
							numInt[j]=numInt[j+2];
						}
						sc-=2;
					}
					else
						i++;
				}
				
				
				for(i=1;i<=sc;){
					if(signStr[i]=='+'){
						tmp=numInt[i-1]+numInt[i+1];
						numInt[i-1]=tmp;
						for(int j=i;j<=sc-2;j++){
							signStr[j]=signStr[j+2];
							j++;
							numInt[j]=numInt[j+2];
						}
						sc-=2;
					}
					else
						i++;
				}
				
				resNum=tmp;

				resStr=String.valueOf(resNum);
				result.setText(resStr);
				show="";
				
			}
		});
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			//	Toast.makeText(MainActivity.this, "x working", 10000).show();
				
				String str=delchar();
				input.setText(str);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public String addchar(char a){
			show+=a;
		return show;
		
	}
	public String delchar(){
		show = show.substring(0, show.length() - 1);
		return show;
	}
}