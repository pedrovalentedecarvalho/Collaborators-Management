public class Colaborador {

private static int LastCodigo=0;

int codigo;

String nome;

String morada;

int categoria;

int horas;

private final int VENCIMENTOS_BASE_ANALISTA = 30;

private final int VENCIMENTOS_BASE_PROGRAMADOR = 20;

private final int VENCIMENTOS_BASE_DESIGNER = 15;

public int getCodigo() {

return codigo;

}

public String getNome() {

return nome;

}

public void setNome(String nome) {

this.nome = nome;

}

public String getMorada() {

return morada;

}

public void setMorada(String morada) {

this.morada = morada;

}

public int getCategoria() {

return categoria;

}

public void setCategoria(int categoria) {

this.categoria = categoria;

}

public int getHoras() {

return horas;

}

public void setHoras(int horas) {

this.horas = horas;

}

public Colaborador(int i, String nome2, String morada2, int categoria2){

}

public Colaborador(int codigo, String nome, String morada, int categoria, int horas){

LastCodigo++;

this.codigo = LastCodigo;

this.nome = nome;

this.morada = morada;

this.categoria = categoria;

this.horas = horas;

}

public int vencimento(){

switch (categoria){

case 1:

return VENCIMENTOS_BASE_ANALISTA * horas;

case 2:

return VENCIMENTOS_BASE_PROGRAMADOR * horas;

case 3:

return VENCIMENTOS_BASE_DESIGNER * horas;

default:

return 0;

}

}

}