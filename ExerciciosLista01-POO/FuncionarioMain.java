package ProgramacaoOO;

public class FuncionarioMain {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("Roberto", 54, "Professor", "Col�gio Javali");
		
		System.out.println(func1.informacoesFuncionario());
	}
}
