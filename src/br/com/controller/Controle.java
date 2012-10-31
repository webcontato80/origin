
package br.com.controller;
import java.io.*;

/**
 * Classe para incrementar as funcões de controle de algumas variaveis e armazenar estados em arquivo texto
 * @author Alex/Vanderson
 *
 */

public class Controle {
static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
static PrintStream stdout  = System.out;

public static void writeln(double n)
	{
		System.out.println("" + n);
	}
public static void write(double n)
	{
		System.out.print("" + n);
	}
public static void writeln(int n)	
	{
		System.out.println("" + n);
	}
public static void write(int n)	
	{
		System.out.print("" + n);
	}
public static void writeln(char x)
	{
		System.out.println("" + x);
	}
public static void writeln(String s)
	{	
		System.out.println(s);
	}
public static void writeln()	
	{
		System.out.println();
	}
public static void write(String s)
	{
		System.out.print(s);
	}


/**
 * Metodo que recebe uma string
 */

public static String readln(String s) { 
		write(s); 
		return readln();
}

/**
 * Metodo que trata uma mensagem e retorna para ser armazenada em um arquivo texto
 * @return (msg)
 */
public static String readln() {
String msg = "";
try {
	msg = stdin.readLine();

	} catch (IOException exc) {Controle.writeln("Sessão Expirada Devido A Erros");}
	return(msg);
}

public static int read_int(String s) { write(s); return read_int();}

/**
 * Metodo que avalia uma string transforma em inteiro e faz o tratamento de exceção chamando os metodos de controle
 * @return val
 */

public static int read_int() {
int val=0;
try {
	val = Integer.parseInt(readln());

	} catch (NumberFormatException exc) {Controle.writeln("Sessão Expirada Devido A Erros");}
	return(val);
}

public static double read_double(String s) { write(s); return read_double();}

/**
 * Metodo que avalia uma string transforma em double e faz o tratamento de exceção chamando os metodos de controle
 * @return val
 */

public static double read_double() {
	double val=0;
	try {
	  val = Double.parseDouble(readln());
	} catch (NumberFormatException exc) {Controle.writeln("Sessão Expirada Devido A Erros");}
return(val);
}

/**
 * Metodo que avalia uma string
 * @return char_val
 */
public static int readKey() {
PushbackInputStream stdin = new PushbackInputStream(System.in);
int char_val=0;
try {
  char_val = stdin.read();
} catch (IOException exc) {Controle.writeln("Sessão Expirada Devido A Erros");}
return(char_val);
}

}
