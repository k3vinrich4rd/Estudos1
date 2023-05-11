package br.com.alura.estudos.javacurso.classesanonimas;

public class ClasseAnonima1 {
    public void imprimeTexto() {
        System.out.println("Qualquer texto");
    }

    public static void main(String[] args) {

        //Utilizando classe an�nima sem a anota��o @override
        //Que garante que o m�todo que est� sendo sobrescrito tenha os mesmos retornos
        ClasseAnonima1 classeAnonima1 = new ClasseAnonima1() {
            public void imprimeTexto() {
                System.out.println("Sobrescrevendo o m�todo");
            }
        };
        classeAnonima1.imprimeTexto();


        //Utilizando classe an�nima com a anota��o @override
        //� poss�vel instanciar uma �interface� no java, mas por uma classe an�nima
        Text text = new Text() {
            @Override
            public void text() {
                System.out.println("Pel�");
            }
        };
        text.text();
    }
}