/* Automated Text Typeing File
*  Copyright 2013 Shivam Bansal (www.shivambansal.com)
*  Version 0.1
*/

import java.awt.Robot;
import java.awt.event.KeyEvent;
public class Fun{
	void start(String hello)
	{
		try{
			Robot shaz;
			shaz=new Robot();
			shaz.setAutoDelay(100);
			char ch;
			int i=0;
			int len=0;
			String textz=hello;
			len=textz.length();
			if(textz.indexOf(".")!=-1)
				{
					textz=textz.replaceAll("\\s","")
				}
				if(textz.equals("enter"))
					{
						textz="`"}
						for(i=0;i<+len;i++)
							{
								ch=textz.charAt(i);
								switch(ch){
									case'`':shaz.keyPress(KeyEvent.VK_ENTER);break;
									case'=':shaz.keyPress(KeyEvent.VK_EQUALS);break;
									case'!':shaz.keyPress(KeyEvent.VK_EXCLAMATION_MARK);
									break;case'@':shaz.keyPress(KeyEvent.VK_AT);break;
									case'#':shaz.keyPress(KeyEvent.VK_NUMBER_SIGN);break;
									case'$':shaz.keyPress(KeyEvent.VK_DOLLAR);break;
									case'^':shaz.keyPress(KeyEvent.VK_CIRCUMFLEX);break;
									case'&':shaz.keyPress(KeyEvent.VK_AMPERSAND);break;
									case'*':shaz.keyPress(KeyEvent.VK_ASTERISK);break;
									case'(':shaz.keyPress(KeyEvent.VK_LEFT_PARENTHESIS);break;
									case')':shaz.keyPress(KeyEvent.VK_RIGHT_PARENTHESIS);break;
									case'_':shaz.keyPress(KeyEvent.VK_UNDERSCORE);break;
									case'+':shaz.keyPress(KeyEvent.VK_PLUS);break;
									case'-':shaz.keyPress(KeyEvent.VK_MINUS);break;
									case'\t':shaz.keyPress(KeyEvent.VK_TAB);break;
									case'[':shaz.keyPress(KeyEvent.VK_OPEN_BRACKET);break;
									case']':shaz.keyPress(KeyEvent.VK_CLOSE_BRACKET);break;
									case'\\':shaz.keyPress(KeyEvent.VK_BACK_SLASH);break;
									case';':shaz.keyPress(KeyEvent.VK_SEMICOLON);break;
									case':':shaz.keyPress(KeyEvent.VK_COLON);break;
									case'\'':shaz.keyPress(KeyEvent.VK_QUOTE);break;
									case'"':shaz.keyPress(KeyEvent.VK_QUOTEDBL);break;
									case',':shaz.keyPress(KeyEvent.VK_COMMA);break;
									case'<':shaz.keyPress(KeyEvent.VK_LESS);break;
									case'.':shaz.keyPress(KeyEvent.VK_PERIOD);break;
									case'>':shaz.keyPress(KeyEvent.VK_GREATER);break;
									case'/':shaz.keyPress(KeyEvent.VK_SLASH);break;
									case'A':case'a':shaz.keyPress(KeyEvent.VK_A);break;
									case'b':case'B':shaz.keyPress(KeyEvent.VK_B);break;
									case'c':case'C':shaz.keyPress(KeyEvent.VK_C);break;
									case'd':case'D':shaz.keyPress(KeyEvent.VK_D);break;
									case'e':case'E':shaz.keyPress(KeyEvent.VK_E);break;
									case'f':case'F':shaz.keyPress(KeyEvent.VK_F);break;
									case'g':case'G':shaz.keyPress(KeyEvent.VK_G);break;
									case'h':case'H':shaz.keyPress(KeyEvent.VK_H);break;
									case'i':case'I':shaz.keyPress(KeyEvent.VK_I);break;
									case'j':case'J':shaz.keyPress(KeyEvent.VK_J);break;
									case'k':case'K':shaz.keyPress(KeyEvent.VK_K);break;
									case'l':case'L':shaz.keyPress(KeyEvent.VK_L);break;
									case'm':case'M':shaz.keyPress(KeyEvent.VK_M);break;
									case'n':case'N':shaz.keyPress(KeyEvent.VK_N);break;
									case'o':case'O':shaz.keyPress(KeyEvent.VK_O);break;
									case'p':case'P':shaz.keyPress(KeyEvent.VK_P);break;
									case'q':case'Q':shaz.keyPress(KeyEvent.VK_Q);break;
									case'r':case'R':shaz.keyPress(KeyEvent.VK_R);break;
									case's':case'S':shaz.keyPress(KeyEvent.VK_S);break;
									case't':case'T':shaz.keyPress(KeyEvent.VK_T);break;
									case'u':case'U':shaz.keyPress(KeyEvent.VK_U);break;
									case'v':case'V':shaz.keyPress(KeyEvent.VK_V);break;
									case'w':case'W':shaz.keyPress(KeyEvent.VK_W);break;
									case'x':case'X':shaz.keyPress(KeyEvent.VK_X);break;
									case'y':case'Y':shaz.keyPress(KeyEvent.VK_Y);break;
									case'z':case'Z':shaz.keyPress(KeyEvent.VK_Z);break;
									case' ':shaz.keyPress(KeyEvent.VK_SPACE);break;
									case'0':shaz.keyPress(KeyEvent.VK_0);break;
									case'1':shaz.keyPress(KeyEvent.VK_1);break;
									case'2':shaz.keyPress(KeyEvent.VK_2);break;
									case'3':shaz.keyPress(KeyEvent.VK_3);break;
									case'4':shaz.keyPress(KeyEvent.VK_4);break;
									case'5':shaz.keyPress(KeyEvent.VK_5);break;
									case'6':shaz.keyPress(KeyEvent.VK_6);break;
									case'7':shaz.keyPress(KeyEvent.VK_7);break;
									case'8':shaz.keyPress(KeyEvent.VK_8);break;
									case'9':shaz.keyPress(KeyEvent.VK_9);break;
									default:throw new IllegalArgumentException("exception "+ch);}
								}
								shaz.keyPress(KeyEvent.VK_SPACE)
							}
								catch(Exception e){

								}
							}
						}
