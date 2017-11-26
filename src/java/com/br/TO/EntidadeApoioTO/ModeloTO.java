package com.br.TO.EntidadeApoioTO;

public class ModeloTO {

	private long codigo;
	private String nome;
        private MarcaTO marca;

	public ModeloTO(long codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

    public ModeloTO(long codigo) {
        this.codigo = codigo;
    }
        

	public ModeloTO(String nome) {
		this.nome = nome;
	}

	public ModeloTO() {
		this.codigo = 0;
		this.nome = "";
                this.marca = new MarcaTO();
	}

  

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    @Override
    public String toString() {
        return "ModeloTO{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }

    public MarcaTO getMarca() {
        return marca;
    }

    public void setMarca(MarcaTO marca) {
        this.marca = marca;
    }

        
}
