package br.scp.controle;

import org.apache.log4j.Logger;

import br.scp.modelo.ControleDeTemperaturaDAO;
import br.scp.modelo.Empresa;
import br.scp.modelo.EmpresaDAO;

public class Controle {
	Empresa empresa;
	EmpresaDAO empresaDAO;
	ControleDeTemperaturaDAO controleDeTemperaturaDAO;
	Logger logger = Logger.getLogger(ControleDeTemperaturaDAO.class);
	public Controle() {
		empresa = new Empresa();
		empresaDAO = new EmpresaDAO();
		controleDeTemperaturaDAO = new ControleDeTemperaturaDAO();
	}
	public String setAtributos(String cnpj, String rs, String end, String he, String hs, String cj1, String cj2, String cj3, String temp, String hi, String ht) {
		String msg = "";
		try {
			empresa.setCnpj(cnpj);
			empresa.setRazaoSocial(rs);
			empresa.setEndereco(end);
			empresa.setHorarioEntrada(Integer.parseInt(he));
			empresa.setHorarioSaida(Integer.parseInt(hs));
			empresa.setConjuntos(Integer.parseInt(cj1));
			empresa.setConjuntos(Integer.parseInt(cj2));
			empresa.setConjuntos(Integer.parseInt(cj3));
			empresa.setTemperaturaMaxima(Integer.parseInt(temp));
			empresa.setTemperaturaHI(Integer.parseInt(hi));
			empresa.setTemperaturaHT((Integer.parseInt(ht)));
			empresaDAO.adiciona(empresa);
			controleDeTemperaturaDAO.adiciona(empresa.getCnpj(), empresa.getControleDeTemperatura());
			msg = "cadastro realizado com sucesso";
		} catch (Exception e) {
			msg = "dados invalidos";
			logger.info("classe controle = " + e.getMessage());
		}
		return msg;
	}
}
