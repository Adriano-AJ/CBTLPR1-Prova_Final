public class Main {

	public static void main(String[] args) {
		
		        ConsultaAgendada p1 = new ConsultaAgendada(13, 30, 15, 25, 3, 2025, "Adriano", "Arthur");

		        System.out.println("--------------------- CONSULTA 1 ---------------------");
		        System.out.printf("Nome do Médico: %s\n", p1.getNomeMedico());
		        System.out.printf("Nome do Paciente: %s\n", p1.getNomePaciente());
		        System.out.printf("Data: %s\n", p1.getData());
		        System.out.printf("Hora: %s\n", p1.getHora());

		        ConsultaAgendada p2 = new ConsultaAgendada();

		        System.out.println("--------------------- CONSULTA 2 ---------------------");
		        System.out.printf("Nome do Médico: %s\n", p2.getNomeMedico());
		        System.out.printf("Nome do Paciente: %s\n", p2.getNomePaciente());
		        System.out.printf("Data: %s\n", p2.getData());
		        System.out.printf("Hora: %s\n", p2.getHora());

		        System.out.println("------------- ATUALIZAÇÃO DOS DADOS DA CONSULTA 1 -------------");
		        p1.setData();
		        p1.setHora();
		        p1.setNomePaciente();
		        p1.setNomeMedico();

		        System.out.println("--------------------- CONSULTA 1 ATUALIZADA ---------------------");
		        System.out.printf("Nome do Médico: %s\n", p1.getNomeMedico());
		        System.out.printf("Nome do Paciente: %s\n", p1.getNomePaciente());
		        System.out.printf("Data: %s\n", p1.getData());
		        System.out.printf("Hora: %s\n", p1.getHora());

		        System.out.println("-------------------------------------------------------");
		        System.out.printf("Quantidade de consultas agendadas: %d\n", ConsultaAgendada.getAmostra());	 

	}

}
