package fatec;


public class CalculadoraSalario {

	    public double calcularSalario(String cargo, double salarioBase) {
	        switch (cargo) {
	            case "DESENVOLVEDOR":
	                return calcularSalarioDesenvolvedor(salarioBase);
	            case "DBA":
	                return calcularSalarioDBA(salarioBase);
	            case "TESTADOR":
	                return calcularSalarioTestador(salarioBase);
	            case "GERENTE":
	                return calcularSalarioGerente(salarioBase);
	            default:
	                throw new IllegalArgumentException("Cargo inválido.");
	        }
	    }

	    private double calcularSalarioDesenvolvedor(double salarioBase) {
	        if (salarioBase >= 3000) {
	            return salarioBase * 0.8;
	        } else {
	            return salarioBase * 0.9;
	        }
	    }
	    
	    private double calcularSalarioDBA(double salarioBase) {
	        if (salarioBase >= 2000) {
	            return salarioBase * 0.75;
	        } else {
	            return salarioBase * 0.85;
	        }
	    }

	    private double calcularSalarioTestador(double salarioBase) {
	        if (salarioBase >= 2000) {
	            return salarioBase * 0.75;
	        } else {
	            return salarioBase * 0.85;
	        }
	    }

	    private double calcularSalarioGerente(double salarioBase) {
	        if (salarioBase >= 5000) {
	            return salarioBase * 0.7;
	        } else {
	            return salarioBase * 0.8;
	        }
	    }

}
