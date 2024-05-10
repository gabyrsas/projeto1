package projetojava.model;

public abstract class ProjetoJava {
	  
	   private int numero;
	   private int quantidade;
	   private String nome;
	
	   public ProjetoJava(int numero, int quantidade, int retirar, int colocar, String nome) {
		this.numero = numero;
		this.quantidade = quantidade;
		this.nome = nome;
	} 

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void visualizar() {
	
	
		
		
    System.out.println("\n********************************************");
    System.out.println("                  produtos					  ");
    System.out.println("**********************************************");
    System.out.println("ID:" + this.numero);
    System.out.println("produto:" + this.nome);
    System.out.println("quantidade:"+ this.quantidade);
  
	}
    
}
