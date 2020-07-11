package Model;

public class Cls_Calculo {

    public int Calcular(int ValorA, int ValorB, char Operacao) {
        int Resultado = 0;
        if (Operacao == '+') {
            Resultado = ValorA + ValorB;
        } else if (Operacao == '-') {
            Resultado = ValorA - ValorB;
        } else if (Operacao == '*') {
            Resultado = ValorA * ValorB;
        } else if (Operacao == '/') {
            Resultado = ValorA / ValorB;
        }
        return Resultado;
    }
}
