package br.com.alura.estudos.javacurso.classeslocal;

/* Com a classe local, podemos cria - l� dentro de um m�todo,
inst�ncia, chamar os m�todos dessa classe...
Por�m, quando utilizamos a classe local, a classe s� tem escopo no m�todo
sendo imposs�vel instanciar a um objeto da classe fora do m�todo que ela pertence.
 */
public class Local {
    public void metodoQualquer() {
        class ClasseLocal {
            private String text = "texto classe local";

            public void imprimeTexto() {
                System.out.println(text);
            }
        }

        ClasseLocal classeLocal = new ClasseLocal();
        classeLocal.imprimeTexto();

    }

    //Forma de instanciar
    public static void main(String[] args) {
        Local local = new Local();
        local.metodoQualquer();
    }
}