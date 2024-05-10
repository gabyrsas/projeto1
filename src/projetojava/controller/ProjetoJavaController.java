package projetojava.controller;

import java.util.ArrayList;
import projetojava.model.ProjetoJava;
import projetojava.repository.ProjetoJavaRepository;

public class ProjetoJavaController implements ProjetoJavaRepository {
    
    private ArrayList<ProjetoJava> listaProdutos = new ArrayList<ProjetoJava>();
    private int numero = 0;
   
 

    public void procurarPorNumero(int numero) {
        ProjetoJava projetojava = buscarNaCollection(numero);
        
        if (projetojava != null)
            projetojava.visualizar();
        else
            System.out.println("\nO produto número: " + numero + " não consta no cadastro!");
    }

    public void listarTodos() {
        for (ProjetoJava projetojava : listaProdutos) {
            projetojava.visualizar();
        }
    }

    public void cadastrar(ProjetoJava projetojava) {
        listaProdutos.add(projetojava);
        System.out.println("\nO produto de número: " + projetojava.getNumero() + " foi cadastrado com sucesso!");
    }

   
    public void atualizar(ProjetoJava projetojava) {
        ProjetoJava buscarProduto = buscarNaCollection(projetojava.getNumero());
        
        if (buscarProduto != null) {
            listaProdutos.set(listaProdutos.indexOf(buscarProduto), projetojava);
            System.out.println("\nO produto número: " + projetojava.getNumero() + " foi atualizado com sucesso!");
        } else
            System.out.println("\nO produto número: " + projetojava.getNumero() + " não foi  encontrado!");
    }

    public void deletar(int numero) {
        ProjetoJava projetojava = buscarNaCollection(numero);
        
        if (projetojava != null) {
            listaProdutos.remove(projetojava);
            System.out.println("\nO produto número: " + numero + " foi deletado com sucesso!");
        } else
            System.out.println("\nO produto número: " + numero + " não foi encontrado!");
    }

    public void retirar(int numero, int valor) {
        ProjetoJava projetojava = buscarNaCollection(numero);
        
       
    }

    public int gerarNumero() {
        return ++numero;
    }

    public ProjetoJava buscarNaCollection(int numero) {
        for (ProjetoJava projetojava : listaProdutos) {
            if (projetojava.getNumero() == numero) {
                return projetojava;
            }
        }
        
        return null;
    }
}