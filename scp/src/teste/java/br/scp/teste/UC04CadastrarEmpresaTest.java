package br.scp.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.scp.controle.Controle;
import br.scp.modelo.ControleDeTemperatura;
import br.scp.modelo.ControleDeTemperaturaDAO;
import br.scp.modelo.Empresa;
import br.scp.modelo.EmpresaDAO;

public class UC04CadastrarEmpresaTest {
	static public Empresa empresa;
	static public Controle controle;
	static public EmpresaDAO empresaDAO;
	static public ControleDeTemperatura controleDeTemperatura;
	static public ControleDeTemperaturaDAO controleDeTemperaturaDAO;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		controleDeTemperaturaDAO = new ControleDeTemperaturaDAO();
		controle = new Controle();
		empresa = new Empresa();
		empresa.setCnpj("02683322000108");
		empresa.setRazaoSocial("grupo pao de acucar");
		empresa.setHorarioEntrada(8);
		empresa.setHorarioSaida(18);
		empresa.setTemperaturaHI(8);
		empresa.setTemperaturaHT(18);
		empresa.setTemperaturaMaxima(21);
		empresa.setConjuntos(111);
		empresa.setConjuntos(112);
		empresa.setConjuntos(113);
		controleDeTemperatura = new ControleDeTemperatura();
		controleDeTemperatura.setTemperaturaMaxima(21);
		controleDeTemperatura.setHorarioInicio(8);
		controleDeTemperatura.setHorarioTermino(18);
		
	}
	@Test
	public void CT01UC04FBcadastrar_com_sucesso() {
		assertEquals (3,empresa.getConjuntos().size());
	}
	/**
	 * valida o comportamento da classe controle na inclusao de uma empresa
	 * com sucesso
	 */
	@Test
	public void CT02UC04FBcadastrar_com_sucesso() {
		assertEquals ("cadastro realizado com sucesso",controle.setAtributos("02683322000108", "grupo pao de acucar", "rua taquari","8", "18", "111", "112", "113", "21","8","18"));
		controleDeTemperaturaDAO.exclui("02683322000108");
		empresaDAO.exclui("02683322000108");
	}
	/*
	 * valida o comportamento da classe controle na inclusao de uma empresa
	 * com cnpj invalido
	 */
	@Test
	public void CT03UC04A1cadastrar_empresa_cnpj_invalido() {
		assertEquals ("dados invalidos",controle.setAtributos("026833220001081", "grupo pao de acucar","rua taquari", "8", "18", "111", "112", "113", "21","8","18"));
	}
	/*
	 * valida o comportamento do metodo adiciona da classe EmpresaDAO
	 * resultados esperado 1 registro inserido no banco de dados
	 */
	@Test
	public void CT04UC04FBcadastrar_empresa_com_sucesso() {
		assertEquals (1,empresaDAO.adiciona(empresa));
		empresaDAO.exclui("02683322000108");
	}
	/*
	 * valida o comportamento do metodo adiciona da classe ControleDeTemperaturaDAO
	 * resultados esperado 1 registro inserido no banco de dados
	 */
	@Test
	public void CT05UC04FBcadastrar_empresa_com_sucesso() {
		empresaDAO.adiciona(empresa);
		assertEquals (1,controleDeTemperaturaDAO.adiciona("02683322000108",controleDeTemperatura));
		controleDeTemperaturaDAO.exclui("02683322000108");
		empresaDAO.exclui("02683322000108");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		controleDeTemperaturaDAO.exclui("02683322000108");
		empresaDAO.exclui("02683322000108");
	}

	

}

