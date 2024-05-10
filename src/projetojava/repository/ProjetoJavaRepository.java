package projetojava.repository;

import projetojava.model.ProjetoJava;

public interface ProjetoJavaRepository {
	
	//crud
		public void procurarPorNumero(int numero);
		public void listarTodos();
		public void cadastrar (ProjetoJava projetojava);
		public void deletar (int numero);
}
