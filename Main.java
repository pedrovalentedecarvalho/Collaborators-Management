import java.util.ArrayList;
import java.util.Scanner;

public class Main {
ArrayList<Colaborador> colaboradores = new ArrayList<Colaborador>();
  Scanner scan = new Scanner(System.in);
  public Main(){
   menu();
  }
 
  private void menu(){
   int opcao=0;
  
  
   while(true){
    System.out.println("Menu Principal");
       System.out.println("1...Gestão de Colaboradores");
       System.out.println("2...Processamento de Vencimentos");
       System.out.println("3...Sair");
       opcao = scan.nextInt(); scan.nextLine();
      
      
       switch(opcao){
       case 1:
        Gestao();
        break;
       case 2:
        Processamento();
        break;
       case 3:
        System.exit(0);
        default:
         System.out.println("Opçao invalida");
       }
      }
  }
  
   private void Gestao(){
    int opcao=0;
    boolean fim = true;
   
    while(fim){
     System.out.println("Gestão de Colaboradores");
        System.out.println("1...Registo de colaborador");
        System.out.println("2...Ver ficha de colaborador");
        System.out.println("3...Editar ficha de colaborador");
        System.out.println("4...Listar colaboradores");
        System.out.println("5...Menu Principal");
        opcao = scan.nextInt(); scan.nextLine();
       
       
        switch(opcao){
        case 1:
         Registo();
         break;
        case 2:
         Ver();
         break;
        case 3:
         Editar();
         break;
        case 4:
         Listar();
         break;
        case 5:
        fim = false;
        }
       }
   }
  
   private void Registo(){
	   int i = 0;
	   i++;
       System.out.println("Nome: ");
       String nome  = scan.nextLine();
       System.out.println("Morada: ");
       String morada = scan.nextLine();
       System.out.println("Categoria: ");
       int categoria = scan.nextInt(); scan.nextLine();
       System.out.println("Horas: ");
       int horas = scan.nextInt(); scan.nextLine();
      
       Colaborador rt = new Colaborador(i, nome , morada, categoria , horas );
       colaboradores.add(rt);
   }
  
   private void Ver(){
 
       Colaborador colaborador = null;
    System.out.print("Total de Colaboradores: " + colaboradores.size());
       System.out.println(" Codigo: ");
       int codigo = scan.nextInt(); scan.nextLine();
       for(int i=0; i<colaboradores.size(); i++){
           Colaborador c = (Colaborador)colaboradores.get(i);
           if(c.getCodigo() == codigo){
            colaborador = c;
            break;
           }
       }
       if(colaborador == null){
        System.out.println("Colaborador Inexistente");
       }else{
        System.out.println("codigo: " + colaborador.getCodigo());
        System.out.println("Nome: " + colaborador.getNome());
        System.out.println("Morada: " + colaborador.getMorada());
        System.out.println("Categoria: " + colaborador.getCategoria());
        System.out.println("Horas: " + colaborador.getHoras());
       }
       
   }
  
   private void Editar(){
    Colaborador colaborador = null;
    System.out.print("Total de Colaboradores: " + colaboradores.size());
       System.out.println(" Codigo: ");
       int codigo = scan.nextInt(); scan.nextLine();
       for(int i=0; i<colaboradores.size(); i++){
           Colaborador c = (Colaborador)colaboradores.get(i);
           if(c.getCodigo() == codigo){
            colaborador = c;
            break;
           }
       }
       if(colaborador == null){
        System.out.println("Colaborador Inexistente!");
       }else{
           System.out.println("Nome: ");
           String nome  = scan.nextLine();
           colaborador.setNome(nome);
           System.out.println("Morada: ");
           String morada = scan.nextLine();
           colaborador.setMorada(morada);
           System.out.println("Categoria: ");
           int categoria = scan.nextInt(); scan.nextLine();
           colaborador.setCategoria(categoria);
           System.out.println("Horas: ");
           int horas = scan.nextInt(); scan.nextLine();
           colaborador.setHoras(horas);
       
   }
       }
  
   private void Listar(){
    for(int i=0; i<colaboradores.size();i++){
     Colaborador rt = (Colaborador) colaboradores.get(i);
     System.out.println("codigo: " + rt.getCodigo() + "nome: " + rt.getNome() + "morada: " + rt.getMorada() + "categoria: " + rt.getCategoria() + "horas: " + rt.getHoras());
       }
       System.out.println("=====================");
   }
   
     private void Processamento(){
      int opcao=0;
      boolean fim = true;
     
      while(fim){
       System.out.println("Processamento de Vencimentos");
          System.out.println("1...Registo de horas trabalhadas");
          System.out.println("2...Processar vencimentos");
          System.out.println("3...Menu anterior");
          opcao = scan.nextInt(); scan.nextLine();
         
          switch(opcao){
          case 1:
        	  registoh();
           break;
          case 2:
        	  processar();
           break;
          case 3:
          fim = false;
          default:
        	  System.out.println("Opção Inválida\n");
          }
         }
     }
  
     private void registoh(){

    	 for(int i=0; i<colaboradores.size(); i++){

    	 Colaborador c = (Colaborador) colaboradores.get(i);

    	 System.out.println(" Horas: ");

    	 int Horas = scan.nextInt(); scan.nextLine();

    	 c.setHoras(Horas);

    	 }

    	 }
     
     private void processar(){

    	 for(int i=0; i<colaboradores.size(); i++){

    	 Colaborador c = (Colaborador) colaboradores.get(i);

    	 System.out.println("Codigo:" + c.getCodigo());

    	 System.out.println("Nome:" + c.getNome());

    	 if(c.getCategoria() == 1){

    	 System.out.println("Categoria: Analista");

    	 }else if(c.getCategoria() == 2){

    	 System.out.println("Categoria: Programador");

    	 }else if(c.getCategoria() == 3){

    	 System.out.println("Categoria: Designer");

    	 }

    	 System.out.println("Horas:" + c.getHoras());

    	 System.out.println("Vencimento:" + c.vencimento());

    	 System.out.println("=========================");

    	 }

    	 }
 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
       new Main();{
 }

}
}