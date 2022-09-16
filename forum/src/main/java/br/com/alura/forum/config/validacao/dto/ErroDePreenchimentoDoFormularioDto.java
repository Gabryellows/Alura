package br.com.alura.forum.config.validacao.dto;

public class ErroDePreenchimentoDoFormularioDto {

	private String campoNaoPreenchido;
	private String mensagemErro;
	
	
	public ErroDePreenchimentoDoFormularioDto(String campoNaoPreenchido, String mensagemErro) {
		this.campoNaoPreenchido = campoNaoPreenchido;
		this.mensagemErro = mensagemErro;
	}


	public String getCampoNaoPreenchido() {
		return campoNaoPreenchido;
	}


	public String getMensagemErro() {
		return mensagemErro;
	}	
	
}
