/*
    Definicao da classe Pessoa
*/
package testapessoa;

public class Pessoa {
    
    // variavel de classe (por estar declarada como static)
    private static String nacionalidade;
    
    // variaveis de instancia
    private String nome;
    private String morada;
    private int idade;
    private int nic;
    
    // construtor sem parametros
    public Pessoa(){
        nacionalidade = "portugal";
        nome = "";
        morada = "";
        idade = 0;
        nic = 0;
    }
    
    // construtor com parametros
    public Pessoa( String nome, String morada, int idade, int nic ){
        nacionalidade = "portugal";
        this.nome = nome;
        this.morada = morada;
        this.idade = idade;
        this.nic = nic;
    }
    
    // metodos de classe - apenas atuam sobre as variáveis de classe
    public static void setNacionalidade( String n ){
        nacionalidade = n;
    }
    
    public static String getNacionalidade(){
        return nacionalidade;
    }
    
    // metodos de instancia - metodos de acesso
    // os metodos de instancia apenas atuam sobre as variaveis de instancia
    public void setNome( String nome ){  // metodo modificador
        this.nome = nome;
    }
    
    public String getNome(){  // metodo interrogador
        return nome;
    }
    
     public void setMorada( String morada ){  // metodo modificador
        this.morada = morada;
    }
    
    public String getMorada(){  // metodo interrogador
        return morada;
    }
    
    public void setIdade( int idade ){  // metodo modificador
        this.idade = idade;
    }
    
    public int getIdade(){  // metodo interrogador
        return idade;
    }
    
    public void setNIC( int nic ){  // metodo modificador
        this.nic = nic;
    }
    
    public int getNIC(){  // metodo interrogador
        return nic;
    }
    
    // outros metodos de instancia
    
    // metodo de instancia que verifica qual a mais velha de 2 pessoas
    public boolean maisVelha( Pessoa p ){
       if( this.idade > p.idade )
            return true;
        else
            return false;
    }
    
    // metodo para escrever as variaveis privadas 
    public void print(){
        System.out.println( "Nome  : " + nome );
        System.out.println( "Morada: " + morada );
        System.out.println( "Idade : " + idade );
        System.out.println( "NIC   : " + nic );
        System.out.println( "Nac.  : " + nacionalidade );
        System.out.println();
    }
    
    @Override // sobreposição (override) do método toString
    public String toString(){
        return "" + nome + "|" + morada + "|" + idade + "|" + nic;
    }
}

