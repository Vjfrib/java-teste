//Estudo Procedural de Java
//link do canal que acompanho
//https://www.youtube.com/watch?v=EP7qRe5FjPY&list=PLGPluF_nhP9p6zWTN88ZJ1q9J_ZK148-f&index=3

class Main {
  public static void main(String[] args) {
    System.out.println("\nprimeiro print");
    System.out.println("\nPq tudo em java eh taum longo?");
    //com o git checkout, consegui fazer a volta para aqui.

    /*o replit é bom para aprender a ling, pois te obriga a usar o bash e ainda oferece suporte pra lang, puramente. Lembrando que o github tbm faz isso.
    
    GIT - CONF E COMMAND
    git config --global user.email "you@example.com"
    git config --global user.name "Your Name"
    git push origin HEAD:refs/heads/<nova branch, caso precise>

    lembrando que temos:
    git add .                                  <o ponto serve pra add tudo>
    git commit                              -m <comment> ou :wq (write and quit)
    git checkout <hash>
    git checkout -b <brach nova>
    git checkout -b <brach nova> <hash>
    git push
    git pull
    */

    //vamos lá!!

    //input - sys.out
    System.out.println("\n Teste.\n\n eis os de valores, de text, especiais (bool) e as estruturas...");
    //out puts-

    //variáveis primitivas - Simples, valor fixo
    byte numPequeno = 124; //mesmo tamanho de char
    //testando envio de variaveis
    byte poker;
    poker = 54;
    System.out.println("valor minimo: " + poker + ". eis outras var de valores:"); // dentro de "", mostra a string!
    short inicial;
    int idade;
    long ouro; //int grande

    //flutuantes - 
    float peso;
    double dobro; //dobro de tamanho alocado em relação a float

    inicial = 'v';
    idade = 32;
    ouro = 234234;
    peso = 2234.234f; // estranho. que f esquisito.
    dobro = 3452345.2345234523;
    
    System.out.println(idade);
    System.out.println(ouro);
    System.out.println(inicial);
    System.out.println(peso/3);
    System.out.println(dobro);

    inicial = 'a'; // vai imprimir ASCII
    System.out.println(inicial);
    char letra = 'a';
    System.out.println(letra);


    boolean checkagem;
    checkagem = !false;
    System.out.println(checkagem);


    String teste = "ola mundo";
    System.out.println(teste);

    // e claro:
    byte nome = 1;
    byte Nome = 2;
    System.out.println(nome);
    System.out.println(Nome);


    //Exemplo de... Lembrar que string guarda endereço.
    char testeLetra = 'b';
    boolean testin = (letra == testeLetra);
    if (testin == true) {
      System.out.println("igual");
} else {
      System.out.println("dif");
}

    
  }
}