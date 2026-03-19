public class elevador {
    private int andarAtual;
    private int totalAndares;
    private boolean portaAberta;

    public elevador(){
        this.andarAtual = 0;
        this.totalAndares = 10;
        this.portaAberta = false;
    }
    public void subir(int quantidade){
        if (!portaAberta && andarAtual+quantidade <= totalAndares && quantidade > 0){
            andarAtual=andarAtual + quantidade;
        }
    }
    public void descer(int quantidade){
        if (!portaAberta && andarAtual-quantidade >= 0 && quantidade > 0){
            andarAtual=andarAtual - quantidade;
        }
    }
    public void mostrarAndarAtual(){
        System.out.println("Andar Atual: "+andarAtual);
    }
    public void statusPorta(){
        if (portaAberta){
            System.out.println("Porta Aberta!");
        }
        else{
            System.out.println("Porta Fechada!");
        }
    }
    public void abrirPorta(){
        portaAberta=true;
    }
    public void fecharPorta(){
        portaAberta=false;
    }
}

/*
------------------------------
|        Elevador            |
------------------------------
| - andarAtual: int         |
| - totalAndares: int       |
| - portaAberta: boolean    |
------------------------------
| + subir(int): void        |
| + descer(int): void       |
| + abrirPorta(): void      |
| + fecharPorta(): void     |
| + statusPorta(): void     |
| + mostrarAndarAtual(): int|
------------------------------
*/