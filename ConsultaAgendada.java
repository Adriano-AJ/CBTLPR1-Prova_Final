import java.util.Scanner;

public class ConsultaAgendada {
	
	private Data data; 
	private Hora hora;
	private String nomePaciente;
	private static int quantidade;
	private String nomeMedico;
	
	public ConsultaAgendada() {
		setData();
		setHora();
		setNomePaciente();
		setNomeMedico();
		quantidade++;
	}
	public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med){
		this.hora = new Hora(h, mi, s);
	    this.data = new Data(d, m, a);
	    this.nomePaciente = p;
	    this.nomeMedico = med;
		quantidade++;
	}
	public ConsultaAgendada(Data d, Hora h, String p, String m){
		this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = m;
		quantidade++;
	}
	public void setData(int a, int b, int c) {
		this.data = new Data(a, b, c);
	}
	public void setData() {
		this.data = new Data();
	}
	public void setHora(int a, int b, int c) {
		this.hora = new Hora(a, b, c);
	}
	public void setHora() {
		this.hora = new Hora();
	}	
	public void setNomePaciente(String p) {
		this.nomePaciente = p;
	}
	public void setNomePaciente() {
		java.util.Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do paciente: ");
        this.nomePaciente = sc.nextLine();
	}
	public void setNomeMedico(String m) {
		this.nomeMedico = m;
	}
	public void setNomeMedico() {
		java.util.Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do médico: ");
        this.nomeMedico = sc.nextLine();
	}
	public static int getAmostra() {
		return quantidade;
	}
	public String getData() {
		return this.data.mostra1();
	}
	public String getHora() {
		 return this.hora.getHora1();
	}
	public String getNomePaciente () {
		return nomePaciente;
	}
	public String getNomeMedico(){
		return nomeMedico;
	}
	
}
