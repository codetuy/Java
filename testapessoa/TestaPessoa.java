/*
        Classe para teste da Classe Pessoa
 */

package testapessoa;

import java.util.Scanner;

public class TestaPessoa {

    public static void main(String[] args) {
       
        Scanner leia = new Scanner( System.in );
        int opcao;
        boolean vetorPreenchido = false;
        Pessoa []v = new Pessoa[3];
        
        do{
            System.out.println( "1 - Inserir Pessoas");
            System.out.println( "2 - Lista Pessoas");
            System.out.println( "3 - Alterar Pessoa");
            System.out.println( "4 - Mudar Nacionalidade");
            System.out.println( "5 - Comparar Idades");
            System.out.println( "6 - Sair");
            opcao = leia.nextInt();
            
            switch( opcao ){
                case 1:
                    vetorPreenchido = true;
                    for( int i=0; i<v.length; i++){
                        System.out.println("Insira a pessoa " + (i+1) );
                        v[i] = new Pessoa();
                        leia.nextLine();
                        System.out.print("Nome  : ");
                        v[i].setNome( leia.nextLine() );
                        System.out.print("Morada: ");
                        v[i].setMorada( leia.nextLine() );
                        System.out.print("Idade : ");
                        v[i].setIdade( leia.nextInt() );
                        System.out.print("NIC   : ");
                        v[i].setNIC( leia.nextInt() );
                    }
                    break;
                    
                case 2:
                    if( vetorPreenchido == false ){
                        System.out.println("Vetor ainda não preenchido!");
                        break;
                    }
                    System.out.println();
                      System.out.println("Lista de Pessoas:");
                    for( Pessoa p: v )
                        p.print();
                    System.out.println();
                    break;
                    
                case 3:
                    if( vetorPreenchido == false ){
                        System.out.println("Vetor ainda não preenchido!");
                        break;
                    }
                    boolean encontrado = false;
                    System.out.println("Insira o NIC da pessoa a alterar:");
                    int nic = leia.nextInt();
                    for( int i=0; i<v.length; i++ ){
                        if( v[i].getNIC() == nic ){
                            encontrado = true;                         
                            System.out.print("Novo nome  : ");
                            leia.nextLine();
                            v[i].setNome( leia.nextLine() );
                            System.out.print("Nova morada: ");
                            v[i].setMorada( leia.nextLine() );
                            System.out.print("Nova idade : ");
                            v[i].setIdade( leia.nextInt() );
                            System.out.print("Novo NIC   : ");
                            v[i].setNIC( leia.nextInt() );
                            break;
                        }
                    }
                    if( !encontrado )
                        System.out.println("NIC inexistente");
                    
                    break;
                
                case 4:
                    if( vetorPreenchido == false ){
                        System.out.println("Vetor ainda não preenchido!");
                        break;
                    }
                    System.out.print("Insira a nova nacionalidade: ");
                    leia.nextLine();
                    // os metodos de classe sao chamados usando o nome da classe
                    // no formato NomeDaClasse.nomeDoMetodo
                    Pessoa.setNacionalidade( leia.nextLine());
                    break;   
                    
                case 5:
                    System.out.println("Insira a primeira pessoa: ");
                    Pessoa p1 = new Pessoa();
                    leia.nextLine();
                    System.out.print("Nome  : ");
                    p1.setNome( leia.nextLine() );
                    System.out.print("Morada: ");
                    p1.setMorada( leia.nextLine() );
                    System.out.print("Idade : ");
                    p1.setIdade( leia.nextInt() );
                    System.out.print("NIC   : ");
                    p1.setNIC( leia.nextInt() );
                    
                    System.out.println("Insira a segunda pessoa: ");
                    Pessoa p2 = new Pessoa();
                    leia.nextLine();
                    System.out.print("Nome  : ");
                    p2.setNome( leia.nextLine() );
                    System.out.print("Morada: ");
                    p2.setMorada( leia.nextLine() );
                    System.out.print("Idade : ");
                    p2.setIdade( leia.nextInt() );
                    System.out.print("NIC   : ");
                    p2.setNIC( leia.nextInt() );
                    
                    if( p1.maisVelha( p2 ) == true )
                        System.out.println( p1.getNome() + " mais velho que " + p2.getNome());
                    else
                        System.out.println( p2.getNome() + " mais velho que " + p1.getNome());
                    break; 
                    
                case 6:
                    System.out.println( "Fim do programa");
                    break;
                default:
                    System.out.println( "Opcao invalida!");
            }
            
        } while( opcao != 6 );  
    }
}
