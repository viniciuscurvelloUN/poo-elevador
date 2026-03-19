public class Main {
    public static void main(String[] args) {
/* Códigos para testes dos métodos e classe num geral*/
        elevador e1 = new elevador();

        e1.mostrarAndarAtual();
        e1.statusPorta();

        e1.abrirPorta();
        e1.subir(2);
        e1.mostrarAndarAtual();

        e1.fecharPorta();
        e1.subir(3);
        e1.mostrarAndarAtual();

        e1.subir(5);
        e1.mostrarAndarAtual();

        e1.subir(10);
        e1.mostrarAndarAtual();

        e1.descer(2);
        e1.mostrarAndarAtual();

        e1.abrirPorta();
        e1.statusPorta();

        e1.fecharPorta();
        e1.statusPorta();
    }
}