public class Paciente {

    double peso;
    double altura;

    public Paciente (double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public String diagnostico() {
        double imc = calcularIMC(peso, altura);
        String mensagem;
        if(imc < 16) {
            mensagem = "Baixo peso muito grave. IMC: " + imc;
        } else if (imc < 16.99) {
            mensagem = "Baixo peso grave. IMC: " + imc;
        } else if (imc <18.49) {
            mensagem = "Baixo peso. IMC: " + imc;
        } else if (imc < 24.99) {
            mensagem = "Peso normal. IMC: " + imc;
        } else if (imc < 29.99) {
            mensagem = "Sobrepeso. IMC: " + imc;
        } else if (imc < 34.99) {
            mensagem = "Obesidade grau I. IMC: " + imc;
        } else if (imc < 39.99) {
            mensagem = "Obesidade grau II. IMC: " + imc;
        } else {
            mensagem = "Obesidade grau III (obesidade mórbida). IMC: " + imc;
        }

        return mensagem;
    }

}
