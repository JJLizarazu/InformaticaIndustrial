#include <iostream>
using namespace std;

// Funciones para las operaciones b�sicas
double suma(double a, double b) {
    return a + b;
}

double resta(double a, double b) {
    return a - b;
}

double multiplicacion(double a, double b) {
    return a * b;
}

double division(double a, double b) {
    if (b != 0) {
        return a / b;
    } else {
        cout << "Error: Divisi�n por cero no permitida." << endl;
        return 0;
    }
}

int main() {
    double num1, num2;
    char operacion;

    cout << "Bienvenido a la calculadora b�sica en C++" << endl;
    cout << "Ingrese la operaci�n que desea realizar (+, -, *, /): ";
    cin >> operacion;

    cout << "Ingrese el primer n�mero: ";
    cin >> num1;

    cout << "Ingrese el segundo n�mero: ";
    cin >> num2;

    double resultado;

    // Selecci�n de la operaci�n a realizar
    switch (operacion) {
        case '+':
            resultado = suma(num1, num2);
            cout << "Resultado: " << resultado << endl;
            break;
        case '-':
            resultado = resta(num1, num2);
            cout << "Resultado: " << resultado << endl;
            break;
        case '*':
            resultado = multiplicacion(num1, num2);
            cout << "Resultado: " << resultado << endl;
            break;
        case '/':
            resultado = division(num1, num2);
            if (num2 != 0) {
                cout << "Resultado: " << resultado << endl;
            }
            break;
        default:
            cout << "Operaci�n no v�lida" << endl;
            break;
    }

    return 0;
}

