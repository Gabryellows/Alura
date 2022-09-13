package br.com.alura.loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.util.JPAUtil;
import br.com.alura.modelo.Categoria;
import br.com.alura.modelo.Produto;

public class CadastroDeProduto {

	public static void main(String[] args) {
		Categoria celulares = new Categoria("Celulares");
		
		EntityManager em = JPAUtil.getEntityManager();
		CategoriaDao dao = new CategoriaDao(em);
		
		em.getTransaction().begin();
		em.persist(celulares);
		celulares.setNome("XPTO");
		em.flush();
		em.clear();
		dao.remover(celulares);
		em.getTransaction().commit();
		em.close();
		
		
		ProdutoDao dao2 = new ProdutoDao(em);
		Produto p = dao2.buscarPorId(1l);
		System.out.println(p.getPreco());
		
		List<Produto> todos = dao2.buscarPorTodos();
		todos.forEach(p2 -> System.out.println(p2));
		
		BigDecimal precoDoProduto = dao2.buscarPorPrecoComNome("Celular");
		System.out.println("Preco do Produto: " + p.getPreco());
		
		

	}

}
