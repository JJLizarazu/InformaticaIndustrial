//	Dado el mes en texto, devolver el mes en n�meros, realizalo en C++
//	Dado los siguientes operadores aritm�ticos Suma, Resta, Multiplicaci�n  y  Divisi�n, devuelva el s�mbolo del operador(+-*/). real�zalo en c++
//	Dado 7 n�meros y almac�nelo en un vector, luego obtenga la suma y el promedio de los valores almacenados. Real�zalo en c++
//	Ingrese 8 n�meros en una matriz de 4X4 y obtenga el promedio aritm�tico Real�zalo en c++
#include <iostream>
#include <String>
using namespace std;
static void monthOnNumbers(string month){
	cout << endl;
	if(month == "enero" || month == "ENERO"){
		cout << "  ===========" << endl;
		cout << "  -->  1  <--" << endl;
		cout << "  ===========" << endl;
	} else if(month == "febrero" || month == "FEBRERO"){
		cout << "  ===========" << endl;
		cout << "  -->  2  <--" << endl;
		cout << "  ===========" << endl;
	} else if(month == "marzo" || month == "MARZO"){
		cout << "  ===========" << endl;
		cout << "  -->  3  <--" << endl;
		cout << "  ===========" << endl;
	} else if(month == "abril" || month == "ABRIL"){
		cout << "  ===========" << endl;
		cout << "  -->  4  <--" << endl;
		cout << "  ===========" << endl;
	} else if(month == "mayo" || month == "MAYO"){
		cout << "  ===========" << endl;
		cout << "  -->  5  <--" << endl;
		cout << "  ===========" << endl;
	} else if(month == "junio" || month == "julio"){
		cout << "  ===========" << endl;
		cout << "  -->  6  <--" << endl;
		cout << "  ===========" << endl;
	} else if(month == "julio" || month == "JULIO"){
		cout << "  ===========" << endl;
		cout << "  -->  7  <--" << endl;	
		cout << "  ===========" << endl;
	} else if(month == "agosto" || month == "AGOSTO"){
		cout << "  ===========" << endl;
		cout << "  -->  8  <--" << endl;
		cout << "  ===========" << endl;
	} else if(month == "septiembre" || month == "SEPTIEMBRE"){
		cout << "  ===========" << endl;
		cout << "  -->  9  <--" << endl;
		cout << "  ===========" << endl;
	} else if(month == "octubre" || month == "OCTUBRE"){
		cout << "  ============" << endl;
		cout << "  -->  10  <--" << endl;
		cout << "  ============" << endl;
	} else if(month == "noviembre" || month == "NOVIEMBRE"){
		cout << "  ============" << endl;
		cout << "  -->  11  <--" << endl;
		cout << "  ============" << endl;
	} else if(month == "diciembre" || month == "DICIEMBRE"){
		cout << "  ============" << endl;
		cout << "  -->  12  <--" << endl;
		cout << "  ============" << endl;
	} else {
		cout << "  =================" << endl;
		cout << "  ESE MES NO EXISTE" << endl;
		cout << "  =================" << endl;
	}
}

int main(){
	cout << "========================" << endl;
	cout << "==  MES  EN  NUMEROS  ==" << endl;
	cout << "========================" << endl;
	cout << "    INGRESE UN MES      " << endl;
	cout << " PARA DEVOLVER SU NUMERO" << endl;
	cout << "========================" << endl;
	string month;
	cout << " -> " ; cin >> month;
	monthOnNumbers(month);
}
